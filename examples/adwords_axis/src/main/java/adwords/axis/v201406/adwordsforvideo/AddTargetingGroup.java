// Copyright 2014 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201406.adwordsforvideo;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201406.cm.Operator;
import com.google.api.ads.adwords.axis.v201406.video.TargetingGroup;
import com.google.api.ads.adwords.axis.v201406.video.TargetingGroupOperation;
import com.google.api.ads.adwords.axis.v201406.video.TargetingGroupReturnValue;
import com.google.api.ads.adwords.axis.v201406.video.VideoTargetingGroupServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example illustrates how to create a video targeting group.
 *
 * Note: AdWords for Video API is a Beta feature.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: VideoTargetingGroupService.mutate
 *
 * Category: adx-exclude
 *
 * @author Ray Tsang
 */
public class AddTargetingGroup {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    AdWordsServices adWordsServices = new AdWordsServices();

    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");

    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(AdWordsServices adWordsServices,
      AdWordsSession session, Long campaignId) throws Exception {
    // Get the VideoTargetingGroupService. 
    VideoTargetingGroupServiceInterface videoTargetingGroupService =
        adWordsServices.get(session, VideoTargetingGroupServiceInterface.class);

    TargetingGroup targetingGroup = new TargetingGroup();
    targetingGroup.setCampaignId(campaignId);
    targetingGroup.setName("My Targeting Group #" + System.currentTimeMillis());

    TargetingGroupOperation operation = new TargetingGroupOperation();
    operation.setOperand(targetingGroup);
    operation.setOperator(Operator.ADD);

    TargetingGroupReturnValue result =
        videoTargetingGroupService.mutate(new TargetingGroupOperation[] {operation});

    for (TargetingGroup targetingGroupResult : result.getValue()) {
      System.out.printf("Targeting group with campaign id %d,"
          + " and targeting group id %d was added.%n",
          targetingGroupResult.getCampaignId(), targetingGroupResult.getId());
    }
  }
}
