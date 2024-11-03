package com.wstxda.clippy.cleaner.providers

object TrackingParametersProvider {
    fun getTrackingFilterList(): Set<String> {
        return setOf(
            "ad_click_id", "ad_id", "ad_name", "ad_position",
            "aff_click_id", "aff_id", "aff_source",
            "campaign", "campaign_id", "campaign_medium", "campaign_name", "campaign_source",
            "click_ref", "conversion_id", "cookie",
            "device_id", "device_type",
            "email_id",
            "event_action", "event_category", "event_id", "event_label", "external_id",
            "fb_event", "fbclid",
            "gclid",
            "group_id",
            "ip",
            "k_click_id",
            "msclkid",
            "partner_id",
            "placement",
            "remarketing_id",
            "ref_id",
            "s1", "s2", "s3", "s4",
            "session", "session_id", "session_user_id",
            "segment_id",
            "source", "source_id",
            "social_id",
            "sub1", "sub2", "sub3", "sub4",
            "tracking", "tracking_id", "track", "track_id",
            "tid", "trk", "trk_id",
            "utm_adgroup", "utm_campaign", "utm_campaign_id", "utm_content", "utm_content_id",
            "utm_id", "utm_medium", "utm_ref", "utm_referrer", "utm_source", "utm_term", "utm_term_id",
            "user_agent", "user_id",
            "visitor_id",
            "wbraid", "wbclid"
        )
    }
}