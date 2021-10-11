package com.example.o2o_test_app.setup.network


object HttpHeaders {
    // HTTP Request and Response header fields
    /**
     * The HTTP `Cache-Control` header field name.
     */
    const val CACHE_CONTROL = "Cache-Control"

    /**
     * The HTTP `Content-Length` header field name.
     */
    const val CONTENT_LENGTH = "Content-Length"

    /**
     * The HTTP `Content-Type` header field name.
     */
    const val CONTENT_TYPE = "Content-Type"

    /**
     * The HTTP `Date` header field name.
     */
    const val DATE = "Date"

    /**
     * The HTTP `Pragma` header field name.
     */
    const val PRAGMA = "Pragma"

    /**
     * The HTTP `Via` header field name.
     */
    const val VIA = "Via"

    /**
     * The HTTP `Warning` header field name.
     */
    const val WARNING = "Warning"
    // HTTP Request header fields
    /**
     * The HTTP `Accept` header field name.
     */
    const val ACCEPT = "Accept"

    /**
     * The HTTP `Accept-Charset` header field name.
     */
    const val ACCEPT_CHARSET = "Accept-Charset"

    /**
     * The HTTP `Accept-Encoding` header field name.
     */
    const val ACCEPT_ENCODING = "Accept-Encoding"

    /**
     * The HTTP `Accept-Language` header field name.
     */
    const val ACCEPT_LANGUAGE = "Accept-Language"

    /**
     * The HTTP `Access-Control-Request-Headers` header field name.
     */
    const val ACCESS_CONTROL_REQUEST_HEADERS = "Access-Control-Request-Headers"

    /**
     * The HTTP `Access-Control-Request-Method` header field name.
     */
    const val ACCESS_CONTROL_REQUEST_METHOD = "Access-Control-Request-Method"

    /**
     * The HTTP `Authorization` header field name.
     */
    const val AUTHORIZATION = "Authorization"

    /**
     * The HTTP `Connection` header field name.
     */
    const val CONNECTION = "Connection"

    /**
     * The HTTP `Cookie` header field name.
     */
    const val COOKIE = "Cookie"

    /**
     * The HTTP `Expect` header field name.
     */
    const val EXPECT = "Expect"

    /**
     * The HTTP `From` header field name.
     */
    const val FROM = "From"

    /**
     * The HTTP `Follow-Only-When-Prerender-Shown` header field name.
     *
     * @since 17.0
     */
    const val FOLLOW_ONLY_WHEN_PRERENDER_SHOWN = "Follow-Only-When-Prerender-Shown"

    /**
     * The HTTP `Host` header field name.
     */
    const val HOST = "Host"

    /**
     * The HTTP `If-Match` header field name.
     */
    const val IF_MATCH = "If-Match"

    /**
     * The HTTP `If-Modified-Since` header field name.
     */
    const val IF_MODIFIED_SINCE = "If-Modified-Since"

    /**
     * The HTTP `If-None-Match` header field name.
     */
    const val IF_NONE_MATCH = "If-None-Match"

    /**
     * The HTTP `If-Range` header field name.
     */
    const val IF_RANGE = "If-Range"

    /**
     * The HTTP `If-Unmodified-Since` header field name.
     */
    const val IF_UNMODIFIED_SINCE = "If-Unmodified-Since"

    /**
     * The HTTP `Last-Event-ID` header field name.
     */
    const val LAST_EVENT_ID = "Last-Event-ID"

    /**
     * The HTTP `Max-Forwards` header field name.
     */
    const val MAX_FORWARDS = "Max-Forwards"

    /**
     * The HTTP `Origin` header field name.
     */
    const val ORIGIN = "Origin"

    /**
     * The HTTP `Proxy-Authorization` header field name.
     */
    const val PROXY_AUTHORIZATION = "Proxy-Authorization"

    /**
     * The HTTP `Range` header field name.
     */
    const val RANGE = "Range"

    /**
     * The HTTP `Referer` header field name.
     */
    const val REFERER = "Referer"

    /**
     * The HTTP `TE` header field name.
     */
    const val TE = "TE"

    /**
     * The HTTP `Upgrade` header field name.
     */
    const val UPGRADE = "Upgrade"

    /**
     * The HTTP `User-Agent` header field name.
     */
    const val USER_AGENT = "User-Agent"
    // HTTP Response header fields
    /**
     * The HTTP `Accept-Ranges` header field name.
     */
    const val ACCEPT_RANGES = "Accept-Ranges"

    /**
     * The HTTP `Access-Control-Allow-Headers` header field name.
     */
    const val ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers"

    /**
     * The HTTP `Access-Control-Allow-Methods` header field name.
     */
    const val ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods"

    /**
     * The HTTP `Access-Control-Allow-Origin` header field name.
     */
    const val ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin"

    /**
     * The HTTP `Access-Control-Allow-Credentials` header field name.
     */
    const val ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials"

    /**
     * The HTTP `Access-Control-Expose-Headers` header field name.
     */
    const val ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers"

    /**
     * The HTTP `Access-Control-Max-Age` header field name.
     */
    const val ACCESS_CONTROL_MAX_AGE = "Access-Control-Max-Age"

    /**
     * The HTTP `Age` header field name.
     */
    const val AGE = "Age"

    /**
     * The HTTP `Allow` header field name.
     */
    const val ALLOW = "Allow"

    /**
     * The HTTP `Content-Disposition` header field name.
     */
    const val CONTENT_DISPOSITION = "Content-Disposition"

    /**
     * The HTTP `Content-Encoding` header field name.
     */
    const val CONTENT_ENCODING = "Content-Encoding"

    /**
     * The HTTP `Content-Language` header field name.
     */
    const val CONTENT_LANGUAGE = "Content-Language"

    /**
     * The HTTP `Content-Location` header field name.
     */
    const val CONTENT_LOCATION = "Content-Location"

    /**
     * The HTTP `Content-MD5` header field name.
     */
    const val CONTENT_MD5 = "Content-MD5"

    /**
     * The HTTP `Content-Range` header field name.
     */
    const val CONTENT_RANGE = "Content-Range"

    /**
     * The HTTP [
 * `Content-Security-Policy`](http://w3.org/TR/CSP/#content-security-policy-header-field) header field name.
     *
     * @since 15.0
     */
    const val CONTENT_SECURITY_POLICY = "Content-Security-Policy"

    /**
     * The HTTP [
 * `Content-Security-Policy-Report-Only`](http://w3.org/TR/CSP/#content-security-policy-report-only-header-field) header field name.
     *
     * @since 15.0
     */
    const val CONTENT_SECURITY_POLICY_REPORT_ONLY = "Content-Security-Policy-Report-Only"

    /**
     * The HTTP `ETag` header field name.
     */
    const val ETAG = "ETag"

    /**
     * The HTTP `Expires` header field name.
     */
    const val EXPIRES = "Expires"

    /**
     * The HTTP `Last-Modified` header field name.
     */
    const val LAST_MODIFIED = "Last-Modified"

    /**
     * The HTTP `Link` header field name.
     */
    const val LINK = "Link"

    /**
     * The HTTP `Location` header field name.
     */
    const val LOCATION = "Location"

    /**
     * The HTTP `P3P` header field name. Limited browser support.
     */
    const val P3P = "P3P"

    /**
     * The HTTP `Proxy-Authenticate` header field name.
     */
    const val PROXY_AUTHENTICATE = "Proxy-Authenticate"

    /**
     * The HTTP `Refresh` header field name. Non-standard header supported by most browsers.
     */
    const val REFRESH = "Refresh"

    /**
     * The HTTP `Retry-After` header field name.
     */
    const val RETRY_AFTER = "Retry-After"

    /**
     * The HTTP `Server` header field name.
     */
    const val SERVER = "Server"

    /**
     * The HTTP `Set-Cookie` header field name.
     */
    const val SET_COOKIE = "Set-Cookie"

    /**
     * The HTTP `Set-Cookie2` header field name.
     */
    const val SET_COOKIE2 = "Set-Cookie2"

    /**
     * The HTTP [
 * `Strict-Transport-Security`](http://tools.ietf.org/html/rfc6797#section-6.1) header field name.
     *
     * @since 15.0
     */
    const val STRICT_TRANSPORT_SECURITY = "Strict-Transport-Security"

    /**
     * The HTTP [
 * `Timing-Allow-Origin`](http://www.w3.org/TR/resource-timing/#cross-origin-resources) header field name.
     *
     * @since 15.0
     */
    const val TIMING_ALLOW_ORIGIN = "Timing-Allow-Origin"

    /**
     * The HTTP `Trailer` header field name.
     */
    const val TRAILER = "Trailer"

    /**
     * The HTTP `Transfer-Encoding` header field name.
     */
    const val TRANSFER_ENCODING = "Transfer-Encoding"

    /**
     * The HTTP `Vary` header field name.
     */
    const val VARY = "Vary"

    /**
     * The HTTP `WWW-Authenticate` header field name.
     */
    const val WWW_AUTHENTICATE = "WWW-Authenticate"
    // Common, non-standard HTTP header fields
    /**
     * The HTTP `DNT` header field name.
     */
    const val DNT = "DNT"

    /**
     * The HTTP `X-Content-Type-Options` header field name.
     */
    const val X_CONTENT_TYPE_OPTIONS = "X-Content-Type-Options"

    /**
     * The HTTP `X-Do-Not-Track` header field name.
     */
    const val X_DO_NOT_TRACK = "X-Do-Not-Track"

    /**
     * The HTTP `X-Forwarded-For` header field name.
     */
    const val X_FORWARDED_FOR = "X-Forwarded-For"

    /**
     * The HTTP `X-Forwarded-Proto` header field name.
     */
    const val X_FORWARDED_PROTO = "X-Forwarded-Proto"

    /**
     * The HTTP `X-Frame-Options` header field name.
     */
    const val X_FRAME_OPTIONS = "X-Frame-Options"

    /**
     * The HTTP `X-Powered-By` header field name.
     */
    const val X_POWERED_BY = "X-Powered-By"

    /**
     * The HTTP [
 * `Public-Key-Pins`](http://tools.ietf.org/html/draft-evans-palmer-key-pinning) header field name.
     *
     * @since 15.0
     */
    const val PUBLIC_KEY_PINS = "Public-Key-Pins"

    /**
     * The HTTP [
 * `Public-Key-Pins-Report-Only`](http://tools.ietf.org/html/draft-evans-palmer-key-pinning) header field name.
     *
     * @since 15.0
     */
    const val PUBLIC_KEY_PINS_REPORT_ONLY = "Public-Key-Pins-Report-Only"

    /**
     * The HTTP `X-Requested-With` header field name.
     */
    const val X_REQUESTED_WITH = "X-Requested-With"

    /**
     * The HTTP `X-User-IP` header field name.
     */
    const val X_USER_IP = "X-User-IP"

    /**
     * The HTTP `X-XSS-Protection` header field name.
     */
    const val X_XSS_PROTECTION = "X-XSS-Protection"

    /**
     * The HTTP [
 * `Ping-From`](http://html.spec.whatwg.org/multipage/semantics.html#hyperlink-auditing) header field name.
     */
    const val PING_FROM = "Ping-From"

    /**
     * The HTTP [
 * {code Ping-To}](http://html.spec.whatwg.org/multipage/semantics.html#hyperlink-auditing) header field name.
     */
    const val PING_TO = "Ping-To"
}