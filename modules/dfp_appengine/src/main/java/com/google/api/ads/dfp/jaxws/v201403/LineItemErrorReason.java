
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALREADY_STARTED"/>
 *     &lt;enumeration value="UPDATE_RESERVATION_NOT_ALLOWED"/>
 *     &lt;enumeration value="ALL_ROADBLOCK_NOT_ALLOWED"/>
 *     &lt;enumeration value="CREATIVE_SET_ROADBLOCK_NOT_ALLOWED"/>
 *     &lt;enumeration value="FRACTIONAL_PERCENTAGE_NOT_ALLOWED"/>
 *     &lt;enumeration value="DISCOUNT_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_CANCELED_LINE_ITEM_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_PENDING_APPROVAL_LINE_ITEM_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_ARCHIVED_LINE_ITEM_NOT_ALLOWED"/>
 *     &lt;enumeration value="FRONTLOADED_NOT_ALLOWED"/>
 *     &lt;enumeration value="CREATE_OR_UPDATE_LEGACY_DFP_LINE_ITEM_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="COPY_LINE_ITEM_FROM_DIFFERENT_COMPANY_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_SIZE_FOR_PLATFORM"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_TYPE_FOR_PLATFORM"/>
 *     &lt;enumeration value="INVALID_WEB_PROPERTY_FOR_PLATFORM"/>
 *     &lt;enumeration value="INVALID_WEB_PROPERTY_FOR_ENVIRONMENT"/>
 *     &lt;enumeration value="AFMA_BACKFILL_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_ENVIRONMENT_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="COMPANIONS_NOT_ALLOWED"/>
 *     &lt;enumeration value="ROADBLOCKS_WITH_NONROADBLOCKS_NOT_ALLOWED"/>
 *     &lt;enumeration value="CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK"/>
 *     &lt;enumeration value="UPDATE_FROM_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_TO_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_BACKFILL_WEB_PROPERTY_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_COMPANION_DELIVERY_OPTION_FOR_ENVIRONMENT_TYPE"/>
 *     &lt;enumeration value="COMPANION_BACKFILL_REQUIRES_VIDEO"/>
 *     &lt;enumeration value="COMPANION_DELIVERY_OPTION_REQUIRE_PREMIUM"/>
 *     &lt;enumeration value="DUPLICATE_MASTER_SIZES"/>
 *     &lt;enumeration value="INVALID_PRIORITY_FOR_LINE_ITEM_TYPE"/>
 *     &lt;enumeration value="INVALID_ENVIRONMENT_TYPE"/>
 *     &lt;enumeration value="INVALID_ENVIRONMENT_TYPE_FOR_PLATFORM"/>
 *     &lt;enumeration value="INVALID_TYPE_FOR_AUTO_EXTENSION"/>
 *     &lt;enumeration value="INVALID_TYPE_FOR_CONTRACTED_UNITS_BOUGHT"/>
 *     &lt;enumeration value="VIDEO_INVALID_ROADBLOCKING"/>
 *     &lt;enumeration value="BACKFILL_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="COMPANION_DELIVERY_OPTIONS_NOT_ALLOWED_WITH_BACKFILL"/>
 *     &lt;enumeration value="INVALID_WEB_PROPERTY_FOR_ADX_BACKFILL"/>
 *     &lt;enumeration value="INVALID_SIZE_FOR_ENVIRONMENT"/>
 *     &lt;enumeration value="TARGET_PLATOFRM_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_CURRENCY"/>
 *     &lt;enumeration value="LINE_ITEM_CANNOT_HAVE_MULTIPLE_CURRENCIES"/>
 *     &lt;enumeration value="CANNOT_CHANGE_CURRENCY"/>
 *     &lt;enumeration value="INVALID_FOR_OFFLINE"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_DATE_TIME"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineItemError.Reason")
@XmlEnum
public enum LineItemErrorReason {


    /**
     * 
     *                 Some changes may not be allowed because a line item has already started.
     *               
     * 
     */
    ALREADY_STARTED,

    /**
     * 
     *                 Update reservation is not allowed because a line item has
     *                 already started, users must pause the line item first.
     *               
     * 
     */
    UPDATE_RESERVATION_NOT_ALLOWED,

    /**
     * 
     *                 Roadblocking to display all creatives is not allowed.
     *               
     * 
     */
    ALL_ROADBLOCK_NOT_ALLOWED,

    /**
     * 
     *                 Roadblocking to display all master and companion creative set is not allowed.
     *               
     * 
     */
    CREATIVE_SET_ROADBLOCK_NOT_ALLOWED,

    /**
     * 
     *                 Fractional percentage is not allowed.
     *               
     * 
     */
    FRACTIONAL_PERCENTAGE_NOT_ALLOWED,

    /**
     * 
     *                 For certain LineItem configurations discounts are not allowed.
     *               
     * 
     */
    DISCOUNT_NOT_ALLOWED,

    /**
     * 
     *                 Updating a canceled line item is not allowed.
     *               
     * 
     */
    UPDATE_CANCELED_LINE_ITEM_NOT_ALLOWED,

    /**
     * 
     *                 Updating a pending approval line item is not allowed.
     *               
     * 
     */
    UPDATE_PENDING_APPROVAL_LINE_ITEM_NOT_ALLOWED,

    /**
     * 
     *                 Updating an archived line item is not allowed.
     *               
     * 
     */
    UPDATE_ARCHIVED_LINE_ITEM_NOT_ALLOWED,

    /**
     * 
     *                 Frontloaded delivery rate type is not allowed.
     *               
     * 
     */
    FRONTLOADED_NOT_ALLOWED,

    /**
     * 
     *                 Create or update legacy dfp line item type is not allowed.
     *               
     * 
     */
    CREATE_OR_UPDATE_LEGACY_DFP_LINE_ITEM_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 Copying line item from different company (advertiser)
     *                 to the same order is not allowed.
     *               
     * 
     */
    COPY_LINE_ITEM_FROM_DIFFERENT_COMPANY_NOT_ALLOWED,

    /**
     * 
     *                 The size is invalid for the specified platform.
     *               
     * 
     */
    INVALID_SIZE_FOR_PLATFORM,

    /**
     * 
     *                 The line item type is invalid for the specified platform.
     *               
     * 
     */
    INVALID_LINE_ITEM_TYPE_FOR_PLATFORM,

    /**
     * 
     *                 The web property cannot be served on the specified platform.
     *               
     * 
     */
    INVALID_WEB_PROPERTY_FOR_PLATFORM,

    /**
     * 
     *                 The web property cannot be served on the specified environment.
     *               
     * 
     */
    INVALID_WEB_PROPERTY_FOR_ENVIRONMENT,

    /**
     * 
     *                 AFMA backfill not supported.
     *               
     * 
     */
    AFMA_BACKFILL_NOT_ALLOWED,

    /**
     * 
     *                 Environment type cannot change once saved.
     *               
     * 
     */
    UPDATE_ENVIRONMENT_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 The placeholders are invalid because they contain companions,
     *                 but the line item does not support companions.
     *               
     * 
     */
    COMPANIONS_NOT_ALLOWED,

    /**
     * 
     *                 The placeholders are invalid because some of them are roadblocks,
     *                 and some are not.  Either all roadblock placeholders must contain
     *                 companions, or no placeholders may contain companions.  This does
     *                 not apply to video creative sets.
     *               
     * 
     */
    ROADBLOCKS_WITH_NONROADBLOCKS_NOT_ALLOWED,

    /**
     * 
     *                 A line item cannot be updated from having
     *                 {@link RoadblockingType#CREATIVE_SET} to having a different
     *                 RoadblockingType, or vice versa.
     *               
     * 
     */
    CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK,

    /**
     * 
     *                 Can not change from a backfill line item type once creatives have been
     *                 assigned.
     *               
     * 
     */
    UPDATE_FROM_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 Can not change to a backfill line item type once creatives have been
     *                 assigned.
     *               
     * 
     */
    UPDATE_TO_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 Can not change to backfill web property once creatives have been
     *                 assigned.
     *               
     * 
     */
    UPDATE_BACKFILL_WEB_PROPERTY_NOT_ALLOWED,

    /**
     * 
     *                 The companion delivery option is not valid for your environment type.
     *               
     * 
     */
    INVALID_COMPANION_DELIVERY_OPTION_FOR_ENVIRONMENT_TYPE,

    /**
     * 
     *                 Companion backfill is enabled but environment type not video.
     *               
     * 
     */
    COMPANION_BACKFILL_REQUIRES_VIDEO,

    /**
     * 
     *                 Companion delivery options require premium networks.
     *               
     * 
     */
    COMPANION_DELIVERY_OPTION_REQUIRE_PREMIUM,

    /**
     * 
     *                 The master size of placeholders have duplicates.
     *               
     * 
     */
    DUPLICATE_MASTER_SIZES,

    /**
     * 
     *                 The line item priority is invalid if for dynamic allocation line items
     *                 it is different than the default for free publishers.  When allowed,
     *                 Premium publishers can change the priority to any value.
     *               
     * 
     */
    INVALID_PRIORITY_FOR_LINE_ITEM_TYPE,

    /**
     * 
     *                 The environment type is not valid.
     *               
     * 
     */
    INVALID_ENVIRONMENT_TYPE,

    /**
     * 
     *                 The environment type is not valid for the target platform.
     *               
     * 
     */
    INVALID_ENVIRONMENT_TYPE_FOR_PLATFORM,

    /**
     * 
     *                 Only {@link LineItemType#STANDARD} line items can be auto extended.
     *               
     * 
     */
    INVALID_TYPE_FOR_AUTO_EXTENSION,

    /**
     * 
     *                 Only goal-based line item types support contracted units bought.
     *               
     * 
     */
    INVALID_TYPE_FOR_CONTRACTED_UNITS_BOUGHT,

    /**
     * 
     *                 Video line items cannot change the roadblocking type.
     *               
     * 
     */
    VIDEO_INVALID_ROADBLOCKING,

    /**
     * 
     *                 The backfill feature is not enabled according to your features.
     *               
     * 
     */
    BACKFILL_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 Companion delivery options are not allowed with dynamic allocation line
     *                 items.
     *               
     * 
     */
    COMPANION_DELIVERY_OPTIONS_NOT_ALLOWED_WITH_BACKFILL,

    /**
     * 
     *                 Dynamic allocation using the AdExchange should always use an AFC web
     *                 property.
     *               
     * 
     */
    INVALID_WEB_PROPERTY_FOR_ADX_BACKFILL,

    /**
     * 
     *                 Aspect ratio sizes cannot be used with video line items.
     *               
     * 
     */
    INVALID_SIZE_FOR_ENVIRONMENT,

    /**
     * 
     *                 The specified target platform is not allowed.
     *               
     * 
     */
    TARGET_PLATOFRM_NOT_ALLOWED,

    /**
     * 
     *                 Currency on a line item must be one of the specified network currencies.
     *               
     * 
     */
    INVALID_LINE_ITEM_CURRENCY,

    /**
     * 
     *                 All money fields on a line item must specify the same currency.
     *               
     * 
     */
    LINE_ITEM_CANNOT_HAVE_MULTIPLE_CURRENCIES,

    /**
     * 
     *                 Once a line item has moved into a a delivering state the currency cannot be changed.
     *               
     * 
     */
    CANNOT_CHANGE_CURRENCY,

    /**
     * 
     *                 The line item settings are invalid for an offline lineitem.
     *               
     * 
     */
    INVALID_FOR_OFFLINE,

    /**
     * 
     *                 A DateTime associated with the line item is not valid.
     *               
     * 
     */
    INVALID_LINE_ITEM_DATE_TIME,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LineItemErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
