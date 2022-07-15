<%@page import="com.smhrd.domain.WriteDAO"%>
<%@page import="com.smhrd.domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>전문가 상세 입력 페이지</title>
<link rel="shortcut icon" href="/1차 프로젝트/img/태린어.png"
	type="image/x-icon" />
<link rel="stylesheet" href="assets/css/456.css" />
<link rel="stylesheet" href="assets/css/123.css">
<link rel="stylesheet" href="assets/css/update.css">

<!-- ==== WOW JS ==== -->
<script src="assets/js/wow.min.js"></script>
<script>
      new WOW().init();
    </script>
<meta charset="utf-8">
<!--<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="google-site-verification" content="fzUsdY8AFahsHxAgVke2Wh1Y_N6hE_dYMWomEwRmn8c">
    <meta name="naver-site-verification" content="f79c29666f9a1588a8e5ac73f8efc9b06ae92e26">
    <link rel="manifest" href="/manifest.json">
    <link rel="search" type="application/opensearchdescription+xml" title="kmong" href="/opensearch.xml">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta property="og:url" content="https://kmong.com/seller/become-a-seller">
    <meta property="og:type" content="website">
    <meta property="og:image" content="https://d2v80xjmx68n4w.cloudfront.net/assets/images/desktop/kmong-pms-og.jpg">
    <meta property="og:image:secure_url"
        content="https://d2v80xjmx68n4w.cloudfront.net/assets/images/desktop/kmong-pms-og.jpg">
    <meta property="og:image:alt" content="크몽까지 내 능력 | 프리랜서 마켓 No.1, 크몽">
    <meta property="og:locale" content="ko_KR">
    <meta property="og:site_name" content="크몽">-->
<link rel="canonical" href="https://kmong.com/seller/become-a-seller">
<script src="./assets/js/jquery-3.6.0.js"></script>
<script src="./assets/js/upload.js"></script>
<script type="text/javascript" async=""
	src="https://www.google-analytics.com/plugins/ua/ec.js"></script>
<script async="" defer=""
	src="https://cdn.megadata.co.kr/dist/prod/enp_tracker_self_hosted.min.js"></script>
<script type="text/javascript" async=""
	src="https://analytics.tiktok.com/i18n/pixel/config.js?sdkid=C8A7JKRA1SKTB42PTQP0&amp;hostname=kmong.com">
    </script>
<script type="text/javascript" async=""
	src="https://www.google-analytics.com/gtm/js?id=GTM-MXSMMLH&amp;t=gtag_UA_9241865_16&amp;cid=700147556.1652684898">
    </script>
<script type="text/javascript" async=""
	src="https://www.googleadservices.com/pagead/conversion_async.js"></script>
<title>나태린 바보다</title>
<link rel="manifest" href="/manifest.json">
<link rel="search" type="application/opensearchdescription+xml"
	title="kmong" href="/opensearch.xml">

<link rel="canonical" href="https://kmong.com/gig/377070">

<link rel="preconnect" href="//d2v80xjmx68n4w.cloudfront.net">
<link rel="dns-prefetch" href="//d2v80xjmx68n4w.cloudfront.net">
<link rel="preload" as="font" crossorigin="anonymous"
	href="//d2v80xjmx68n4w.cloudfront.net/assets/fonts/MetroSans/MetroSans-Regular.woff2">
<link rel="preload" as="font" crossorigin="anonymous"
	href="//d2v80xjmx68n4w.cloudfront.net/assets/fonts/MetroSans/MetroSans-Medium.woff2">
<link rel="preload" as="font" crossorigin="anonymous"
	href="//d2v80xjmx68n4w.cloudfront.net/assets/fonts/MetroSans/MetroSans-Bold.woff2">
<link rel="preload" href="/_next/static/css/555e0f390a93fcfd.css"
	as="style">
<link rel="stylesheet" href="/_next/static/css/555e0f390a93fcfd.css"
	data-n-g="">
<noscript data-n-css=""></noscript>
<script defer="" nomodule=""
	src="/_next/static/chunks/polyfills-5cd94c89d3acac5f.js"></script>
<script src="/_next/static/chunks/webpack-565444f451d4e5e8.js" defer=""></script>
<script src="/_next/static/chunks/framework-44dddc7674429b40.js"
	defer=""></script>
<script src="/_next/static/chunks/main-6c0e31e10cc3fced.js" defer=""></script>
<script src="/_next/static/chunks/pages/_app-e76f6706d1197d13.js"
	defer=""></script>
<script src="/_next/static/chunks/9101-108d84f163a53ff0.js" defer=""></script>
<script src="/_next/static/chunks/9219-3a101921ad1dba4b.js" defer=""></script>
<script src="/_next/static/chunks/3008-9e70c934b798e8ef.js" defer=""></script>
<script src="/_next/static/chunks/4091-c13f030243981ea3.js" defer=""></script>
<script src="/_next/static/chunks/7172-700ca7985c48088b.js" defer=""></script>
<script src="/_next/static/chunks/5209-3902638911ad61e6.js" defer=""></script>
<script src="/_next/static/chunks/4006-8bfbe80b8913381e.js" defer=""></script>
<script src="/_next/static/chunks/7995-c04a741bdaeb82ed.js" defer=""></script>
<script
	src="/_next/static/chunks/pages/seller/become-a-seller-c363d3c455529da1.js"
	defer=""></script>
<script src="/_next/static/VLdLaZipqQ12M4zSRy1ky/_buildManifest.js"
	defer=""></script>
<script src="/_next/static/VLdLaZipqQ12M4zSRy1ky/_ssgManifest.js"
	defer=""></script>
<script src="/_next/static/VLdLaZipqQ12M4zSRy1ky/_middlewareManifest.js"
	defer=""></script>
<script
	src="https://d-collect.jennifersoft.com/fa906806/demian.js?1652684880000"
	async=""></script>
<script charset="utf-8"
	src="https://assets.ubembed.com/universalscript/releases/v0.179.2/bundle.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<link as="script" rel="prefetch"
	href="/_next/static/chunks/3650-c50f13d9a7b7c200.js">
<link as="script" rel="prefetch"
	href="/_next/static/chunks/6834-fe39ed9d47e31a37.js">
<link as="script" rel="prefetch"
	href="/_next/static/chunks/1905-0086dece1abc636d.js">
<link as="script" rel="prefetch"
	href="/_next/static/chunks/7230-c2ced2b0a65fbfbf.js">
<link as="script" rel="prefetch"
	href="/_next/static/chunks/pages/index-20e5bc5ba7992469.js">
<link rel="stylesheet" href="https://use.fontawesome.com/7f85a56ba4.css">
<script src="https://static.uni1id.com/jsf/common/enp_uni_id_adver.js"
	type="text/javascript" defer="" async="">
    </script>
<script
	src="https://cdn.megadata.co.kr/js/socialLink/social_sns_config_min.js"
	type="text/javascript" defer="" async=""></script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/724668846/?random=1652684897738&amp;cv=9&amp;fst=1652684897738&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=1&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dgtag.config&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fseller%2Fbecome-a-seller&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=%ED%94%84%EB%A6%AC%EB%9E%9C%EC%84%9C%20%EB%A7%88%EC%BC%93%20No.1%20%ED%81%AC%EB%AA%BD%20%E3%85%A3%20%ED%81%AC%EB%AA%BD%20%EC%A0%84%EB%AC%B8%EA%B0%80%EB%A1%9C%20%EB%93%B1%EB%A1%9D%ED%95%98%EA%B3%A0%2C%20%EC%88%98%EC%9D%B5%EC%9D%84%20%EC%B0%BD%EC%B6%9C&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/724668846/?random=1652684897740&amp;cv=9&amp;fst=1652684897740&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=1&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dview_become_a_seller%3Bevent_category%3Dsign_up_seller%3Bevent_label%3DWeb%3BnonInteraction%3Dfalse&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fseller%2Fbecome-a-seller&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=%ED%94%84%EB%A6%AC%EB%9E%9C%EC%84%9C%20%EB%A7%88%EC%BC%93%20No.1%20%ED%81%AC%EB%AA%BD%20%E3%85%A3%20%ED%81%AC%EB%AA%BD%20%EC%A0%84%EB%AC%B8%EA%B0%80%EB%A1%9C%20%EB%93%B1%EB%A1%9D%ED%95%98%EA%B3%A0%2C%20%EC%88%98%EC%9D%B5%EC%9D%84%20%EC%B0%BD%EC%B6%9C&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/868535403/?random=1652684897741&amp;cv=9&amp;fst=1652684897741&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=1&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dgtag.config&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fseller%2Fbecome-a-seller&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=%ED%94%84%EB%A6%AC%EB%9E%9C%EC%84%9C%20%EB%A7%88%EC%BC%93%20No.1%20%ED%81%AC%EB%AA%BD%20%E3%85%A3%20%ED%81%AC%EB%AA%BD%20%EC%A0%84%EB%AC%B8%EA%B0%80%EB%A1%9C%20%EB%93%B1%EB%A1%9D%ED%95%98%EA%B3%A0%2C%20%EC%88%98%EC%9D%B5%EC%9D%84%20%EC%B0%BD%EC%B6%9C&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/868535403/?random=1652684897742&amp;cv=9&amp;fst=1652684897742&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=1&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dview_become_a_seller%3Bevent_category%3Dsign_up_seller%3Bevent_label%3DWeb%3BnonInteraction%3Dfalse&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fseller%2Fbecome-a-seller&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=%ED%94%84%EB%A6%AC%EB%9E%9C%EC%84%9C%20%EB%A7%88%EC%BC%93%20No.1%20%ED%81%AC%EB%AA%BD%20%E3%85%A3%20%ED%81%AC%EB%AA%BD%20%EC%A0%84%EB%AC%B8%EA%B0%80%EB%A1%9C%20%EB%93%B1%EB%A1%9D%ED%95%98%EA%B3%A0%2C%20%EC%88%98%EC%9D%B5%EC%9D%84%20%EC%B0%BD%EC%B6%9C&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script charset="utf-8"
	src="https://analytics.tiktok.com/i18n/pixel/identify.js"></script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/868535403/?random=1652684897965&amp;cv=9&amp;fst=1652684897965&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=1&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dform_submit&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fseller%2Fbecome-a-seller&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=%ED%94%84%EB%A6%AC%EB%9E%9C%EC%84%9C%20%EB%A7%88%EC%BC%93%20No.1%20%ED%81%AC%EB%AA%BD%20%E3%85%A3%20%ED%81%AC%EB%AA%BD%20%EC%A0%84%EB%AC%B8%EA%B0%80%EB%A1%9C%20%EB%93%B1%EB%A1%9D%ED%95%98%EA%B3%A0%2C%20%EC%88%98%EC%9D%B5%EC%9D%84%20%EC%B0%BD%EC%B6%9C&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<link as="script" rel="prefetch"
	href="/_next/static/chunks/2194-536bc5b7bd436060.js">
<link as="script" rel="prefetch"
	href="/_next/static/chunks/pages/prime-e2d728c58387d3b7.js">
<link as="script" rel="prefetch"
	href="/_next/static/chunks/4534-bba4b2a1bf9d5867.js">
<link as="script" rel="prefetch"
	href="/_next/static/chunks/pages/enterprise-2f12d0d7805f9666.js">
<link as="script" rel="prefetch"
	href="/_next/static/chunks/7168-f9b92cd91e1e87d9.js">
<link as="script" rel="prefetch"
	href="/_next/static/chunks/pages/freelancer-club-653bf5c938b71612.js">

<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/868535403/?random=1652684907684&amp;cv=9&amp;fst=1652684907684&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=1&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dclick_header_logo%3Bevent_category%3Dheader%3Bevent_label%3D%2Fseller%2Fbecome-a-seller%3BnonInteraction%3Dfalse&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fseller%2Fbecome-a-seller&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=%ED%94%84%EB%A6%AC%EB%9E%9C%EC%84%9C%20%EB%A7%88%EC%BC%93%20No.1%20%ED%81%AC%EB%AA%BD%20%E3%85%A3%20%ED%81%AC%EB%AA%BD%20%EC%A0%84%EB%AC%B8%EA%B0%80%EB%A1%9C%20%EB%93%B1%EB%A1%9D%ED%95%98%EA%B3%A0%2C%20%EC%88%98%EC%9D%B5%EC%9D%84%20%EC%B0%BD%EC%B6%9C&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script>
        +function(a,p,P,b,y){a.appboy={};a.appboyQueue=[];for(var s="initialize destroy getDeviceId toggleAppboyLogging setLogger openSession changeUser requestImmediateDataFlush requestFeedRefresh subscribeToFeedUpdates requestContentCardsRefresh subscribeToContentCardsUpdates logCardImpressions logCardClick logCardDismissal logFeedDisplayed logContentCardsDisplayed logInAppMessageImpression logInAppMessageClick logInAppMessageButtonClick logInAppMessageHtmlClick subscribeToNewInAppMessages subscribeToInAppMessage removeSubscription removeAllSubscriptions logCustomEvent logPurchase isPushSupported isPushBlocked isPushGranted isPushPermissionGranted registerAppboyPushMessages unregisterAppboyPushMessages trackLocation stopWebTracking resumeWebTracking wipeData ab ab.DeviceProperties ab.User ab.User.Genders ab.User.NotificationSubscriptionTypes ab.User.prototype.getUserId ab.User.prototype.setFirstName ab.User.prototype.setLastName ab.User.prototype.setEmail ab.User.prototype.setGender ab.User.prototype.setDateOfBirth ab.User.prototype.setCountry ab.User.prototype.setHomeCity ab.User.prototype.setLanguage ab.User.prototype.setEmailNotificationSubscriptionType ab.User.prototype.setPushNotificationSubscriptionType ab.User.prototype.setPhoneNumber ab.User.prototype.setAvatarImageUrl ab.User.prototype.setLastKnownLocation ab.User.prototype.setUserAttribute ab.User.prototype.setCustomUserAttribute ab.User.prototype.addToCustomAttributeArray ab.User.prototype.removeFromCustomAttributeArray ab.User.prototype.incrementCustomUserAttribute ab.User.prototype.addAlias ab.User.prototype.setCustomLocationAttribute ab.InAppMessage ab.InAppMessage.SlideFrom ab.InAppMessage.ClickAction ab.InAppMessage.DismissType ab.InAppMessage.OpenTarget ab.InAppMessage.ImageStyle ab.InAppMessage.TextAlignment ab.InAppMessage.Orientation ab.InAppMessage.CropType ab.InAppMessage.prototype.subscribeToClickedEvent ab.InAppMessage.prototype.subscribeToDismissedEvent ab.InAppMessage.prototype.removeSubscription ab.InAppMessage.prototype.removeAllSubscriptions ab.InAppMessage.prototype.closeMessage ab.InAppMessage.Button ab.InAppMessage.Button.prototype.subscribeToClickedEvent ab.InAppMessage.Button.prototype.removeSubscription ab.InAppMessage.Button.prototype.removeAllSubscriptions ab.SlideUpMessage ab.ModalMessage ab.FullScreenMessage ab.HtmlMessage ab.ControlMessage ab.Feed ab.Feed.prototype.getUnreadCardCount ab.ContentCards ab.ContentCards.prototype.getUnviewedCardCount ab.Card ab.Card.prototype.dismissCard ab.ClassicCard ab.CaptionedImage ab.Banner ab.ControlCard ab.WindowUtils display display.automaticallyShowNewInAppMessages display.showInAppMessage display.showFeed display.destroyFeed display.toggleFeed display.showContentCards display.hideContentCards display.toggleContentCards sharedLib".split(" "),i=0;i<s.length;i++){for(var m=s[i],k=a.appboy,l=m.split("."),j=0;j<l.length-1;j++)k=k[l[j]];k[l[j]]=(new Function("return function "+m.replace(/\./g,"_")+"(){window.appboyQueue.push(arguments); return true}"))()}window.appboy.getUser=function(){return new window.appboy.ab.User};window.appboy.getCachedFeed=function(){return new window.appboy.ab.Feed};window.appboy.getCachedContentCards=function(){return new window.appboy.ab.ContentCards};(y=p.createElement(P)).type='text/javascript';
            y.src='https://js.appboycdn.com/web-sdk/2.5/appboy.min.js';
            y.async=1;(b=p.getElementsByTagName(P)[0]).parentNode.insertBefore(y,b)
        }(window,document,'script');
        appboy.initialize("c0e540e1-8a7a-486f-b89f-438169b985eb", {baseUrl: "https://customer.iad-03.appboy.com/api/v3"});
        appboy.openSession();
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/724668846/?random=1652684907685&amp;cv=9&amp;fst=1652684907685&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=1&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dclick_header_logo%3Bevent_category%3Dheader%3Bevent_label%3D%2Fseller%2Fbecome-a-seller%3BnonInteraction%3Dfalse&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fseller%2Fbecome-a-seller&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=%ED%94%84%EB%A6%AC%EB%9E%9C%EC%84%9C%20%EB%A7%88%EC%BC%93%20No.1%20%ED%81%AC%EB%AA%BD%20%E3%85%A3%20%ED%81%AC%EB%AA%BD%20%EC%A0%84%EB%AC%B8%EA%B0%80%EB%A1%9C%20%EB%93%B1%EB%A1%9D%ED%95%98%EA%B3%A0%2C%20%EC%88%98%EC%9D%B5%EC%9D%84%20%EC%B0%BD%EC%B6%9C&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/868535403/?random=1652684907784&amp;cv=9&amp;fst=1652684907784&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;eid=376635471&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=2&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dview_market_main%3Bevent_category%3Dmarket_main%3BnonInteraction%3Dfalse&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2F&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=%ED%94%84%EB%A6%AC%EB%9E%9C%EC%84%9C%20%EB%A7%88%EC%BC%93%20No.1%20%ED%81%AC%EB%AA%BD%20%E3%85%A3%20%ED%81%AC%EB%AA%BD%20%EC%A0%84%EB%AC%B8%EA%B0%80%EB%A1%9C%20%EB%93%B1%EB%A1%9D%ED%95%98%EA%B3%A0%2C%20%EC%88%98%EC%9D%B5%EC%9D%84%20%EC%B0%BD%EC%B6%9C&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/724668846/?random=1652684907786&amp;cv=9&amp;fst=1652684907786&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;eid=376635471&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=2&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dview_market_main%3Bevent_category%3Dmarket_main%3BnonInteraction%3Dfalse&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2F&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=%ED%94%84%EB%A6%AC%EB%9E%9C%EC%84%9C%20%EB%A7%88%EC%BC%93%20No.1%20%ED%81%AC%EB%AA%BD%20%E3%85%A3%20%ED%81%AC%EB%AA%BD%20%EC%A0%84%EB%AC%B8%EA%B0%80%EB%A1%9C%20%EB%93%B1%EB%A1%9D%ED%95%98%EA%B3%A0%2C%20%EC%88%98%EC%9D%B5%EC%9D%84%20%EC%B0%BD%EC%B6%9C&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<link as="script" rel="prefetch"
	href="/_next/static/chunks/499-360885571b871b5f.js">
<link as="script" rel="prefetch"
	href="/_next/static/chunks/pages/search-7b05a25c71e0035d.js">
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/868535403/?random=1652684912598&amp;cv=9&amp;fst=1652684912598&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;eid=376635471&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=2&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dclick_directory%3Bevent_category%3Ddirectory%3Bevent_label%3D%EC%9A%B4%EC%84%B8%2Fmarket%2F%2Fcategory%2F9%2F1%2F0%3BnonInteraction%3Dfalse&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2F&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=%ED%81%AC%EB%AA%BD%EA%B9%8C%EC%A7%80%20%EB%82%B4%20%EB%8A%A5%EB%A0%A5%20%7C%20%ED%94%84%EB%A6%AC%EB%9E%9C%EC%84%9C%20%EB%A7%88%EC%BC%93%20No.1%20%ED%81%AC%EB%AA%BD%EC%97%90%EC%84%9C%20%EC%A0%84%EB%AC%B8%EA%B0%80%EB%A5%BC%20%EB%A7%8C%EB%82%98%EA%B3%A0%20&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/724668846/?random=1652684912599&amp;cv=9&amp;fst=1652684912599&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;eid=376635471&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=2&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dclick_directory%3Bevent_category%3Ddirectory%3Bevent_label%3D%EC%9A%B4%EC%84%B8%2Fmarket%2F%2Fcategory%2F9%2F1%2F0%3BnonInteraction%3Dfalse&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2F&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=%ED%81%AC%EB%AA%BD%EA%B9%8C%EC%A7%80%20%EB%82%B4%20%EB%8A%A5%EB%A0%A5%20%7C%20%ED%94%84%EB%A6%AC%EB%9E%9C%EC%84%9C%20%EB%A7%88%EC%BC%93%20No.1%20%ED%81%AC%EB%AA%BD%EC%97%90%EC%84%9C%20%EC%A0%84%EB%AC%B8%EA%B0%80%EB%A5%BC%20%EB%A7%8C%EB%82%98%EA%B3%A0%20&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/868535403/?random=1652684912659&amp;cv=9&amp;fst=1652684912659&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;eid=376635471&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=3&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dview_market_category_list%3Bevent_category%3Dcategory_gig_list%3Bevent_label%3D9%2F9%2F%EC%9A%B4%EC%84%B8%2F%2F%2F%2F%3BnonInteraction%3Dtrue&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fcategory%2F9&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=%ED%81%AC%EB%AA%BD%EA%B9%8C%EC%A7%80%20%EB%82%B4%20%EB%8A%A5%EB%A0%A5%20%7C%20%ED%94%84%EB%A6%AC%EB%9E%9C%EC%84%9C%20%EB%A7%88%EC%BC%93%20No.1%20%ED%81%AC%EB%AA%BD%EC%97%90%EC%84%9C%20%EC%A0%84%EB%AC%B8%EA%B0%80%EB%A5%BC%20%EB%A7%8C%EB%82%98%EA%B3%A0%20&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/724668846/?random=1652684912661&amp;cv=9&amp;fst=1652684912661&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;eid=376635471&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=3&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dview_market_category_list%3Bevent_category%3Dcategory_gig_list%3Bevent_label%3D9%2F9%2F%EC%9A%B4%EC%84%B8%2F%2F%2F%2F%3BnonInteraction%3Dtrue&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fcategory%2F9&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=%ED%81%AC%EB%AA%BD%EA%B9%8C%EC%A7%80%20%EB%82%B4%20%EB%8A%A5%EB%A0%A5%20%7C%20%ED%94%84%EB%A6%AC%EB%9E%9C%EC%84%9C%20%EB%A7%88%EC%BC%93%20No.1%20%ED%81%AC%EB%AA%BD%EC%97%90%EC%84%9C%20%EC%A0%84%EB%AC%B8%EA%B0%80%EB%A5%BC%20%EB%A7%8C%EB%82%98%EA%B3%A0%20&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/868535403/?random=1652684913926&amp;cv=9&amp;fst=1652684913926&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;eid=376635471&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=3&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dclick_detailed_view%3Bevent_category%3Dcategory_gig_list%3Bevent_label%3D1%2F0%3BnonInteraction%3Dfalse&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fcategory%2F9&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=100%2C938%EA%B0%9C%20%EB%A6%AC%EB%B7%B0%EB%A1%9C%20%EC%A6%9D%EB%AA%85%EB%90%9C%2024%2C390%EA%B0%9C%20%EC%9A%B4%EC%84%B8%20%EC%84%9C%EB%B9%84%EC%8A%A4%EB%A5%BC%205%2C000%EC%9B%90%EC%97%90%EC%84%9C%20%EB%B6%80%ED%84%B0%20%EB%A7%8C%EB%82%98%EB%B3%B4%EC%84%B8&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/724668846/?random=1652684913928&amp;cv=9&amp;fst=1652684913928&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;eid=376635471&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=3&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dclick_detailed_view%3Bevent_category%3Dcategory_gig_list%3Bevent_label%3D1%2F0%3BnonInteraction%3Dfalse&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fcategory%2F9&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=100%2C938%EA%B0%9C%20%EB%A6%AC%EB%B7%B0%EB%A1%9C%20%EC%A6%9D%EB%AA%85%EB%90%9C%2024%2C390%EA%B0%9C%20%EC%9A%B4%EC%84%B8%20%EC%84%9C%EB%B9%84%EC%8A%A4%EB%A5%BC%205%2C000%EC%9B%90%EC%97%90%EC%84%9C%20%EB%B6%80%ED%84%B0%20%EB%A7%8C%EB%82%98%EB%B3%B4%EC%84%B8&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/868535403/?random=1652684914386&amp;cv=9&amp;fst=1652684914386&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;eid=376635471&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=4&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dview_market_gig_detail%3Bevent_category%3Dgig_detail%3Bevent_label%3D377070%2F9%2F%EC%9A%B4%EC%84%B8%2F933%2F%ED%83%80%EB%A1%9C%2F%2F%2F%EC%86%8D%20%EC%8B%9C%EC%9B%90%ED%95%9C%20%ED%8C%A9%ED%8A%B8%20%EC%83%81%EB%8B%B4%EC%9C%BC%EB%A1%9C%20%EA%B3%A0%EB%AF%BC%20%ED%95%B4%EA%B2%B0%20%ED%95%A8%EA%BB%98%20%ED%95%B4%20%EB%93%9C%EB%A6%BD%EB%8B%88%EB%8B%A4.%2FF%2F1995816%2F%ED%83%80%EB%A1%9C%EC%98%B9%EC%A3%BC%2F5000%2Fhttps%3A%2F%2Fd2v80xjmx68n4w.cloudfront.net%2Fgigs%2FazbkO1648561719.jpg%3BnonInteraction%3Dtrue&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fgig%2F377070&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=100%2C938%EA%B0%9C%20%EB%A6%AC%EB%B7%B0%EB%A1%9C%20%EC%A6%9D%EB%AA%85%EB%90%9C%2024%2C390%EA%B0%9C%20%EC%9A%B4%EC%84%B8%20%EC%84%9C%EB%B9%84%EC%8A%A4%EB%A5%BC%205%2C000%EC%9B%90%EC%97%90%EC%84%9C%20%EB%B6%80%ED%84%B0%20%EB%A7%8C%EB%82%98%EB%B3%B4%EC%84%B8&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/724668846/?random=1652684914388&amp;cv=9&amp;fst=1652684914388&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;eid=376635471&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=4&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dview_market_gig_detail%3Bevent_category%3Dgig_detail%3Bevent_label%3D377070%2F9%2F%EC%9A%B4%EC%84%B8%2F933%2F%ED%83%80%EB%A1%9C%2F%2F%2F%EC%86%8D%20%EC%8B%9C%EC%9B%90%ED%95%9C%20%ED%8C%A9%ED%8A%B8%20%EC%83%81%EB%8B%B4%EC%9C%BC%EB%A1%9C%20%EA%B3%A0%EB%AF%BC%20%ED%95%B4%EA%B2%B0%20%ED%95%A8%EA%BB%98%20%ED%95%B4%20%EB%93%9C%EB%A6%BD%EB%8B%88%EB%8B%A4.%2FF%2F1995816%2F%ED%83%80%EB%A1%9C%EC%98%B9%EC%A3%BC%2F5000%2Fhttps%3A%2F%2Fd2v80xjmx68n4w.cloudfront.net%2Fgigs%2FazbkO1648561719.jpg%3BnonInteraction%3Dtrue&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fgig%2F377070&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=100%2C938%EA%B0%9C%20%EB%A6%AC%EB%B7%B0%EB%A1%9C%20%EC%A6%9D%EB%AA%85%EB%90%9C%2024%2C390%EA%B0%9C%20%EC%9A%B4%EC%84%B8%20%EC%84%9C%EB%B9%84%EC%8A%A4%EB%A5%BC%205%2C000%EC%9B%90%EC%97%90%EC%84%9C%20%EB%B6%80%ED%84%B0%20%EB%A7%8C%EB%82%98%EB%B3%B4%EC%84%B8&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/868535403/?random=1652684914396&amp;cv=9&amp;fst=1652684914396&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;eid=376635471&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=4&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dview_item%3Bid%3D377070&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fgig%2F377070&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=100%2C938%EA%B0%9C%20%EB%A6%AC%EB%B7%B0%EB%A1%9C%20%EC%A6%9D%EB%AA%85%EB%90%9C%2024%2C390%EA%B0%9C%20%EC%9A%B4%EC%84%B8%20%EC%84%9C%EB%B9%84%EC%8A%A4%EB%A5%BC%205%2C000%EC%9B%90%EC%97%90%EC%84%9C%20%EB%B6%80%ED%84%B0%20%EB%A7%8C%EB%82%98%EB%B3%B4%EC%84%B8&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<script
	src="https://googleads.g.doubleclick.net/pagead/viewthroughconversion/724668846/?random=1652684914398&amp;cv=9&amp;fst=1652684914398&amp;num=1&amp;bg=ffffff&amp;guid=ON&amp;resp=GooglemKTybQhCsO&amp;eid=376635471&amp;u_h=1080&amp;u_w=1920&amp;u_ah=1040&amp;u_aw=1920&amp;u_cd=24&amp;u_his=4&amp;u_tz=540&amp;u_java=false&amp;u_nplug=5&amp;u_nmime=2&amp;gtm=2oa5b0&amp;sendb=1&amp;ig=1&amp;data=event%3Dview_item%3Bid%3D377070&amp;frm=0&amp;url=https%3A%2F%2Fkmong.com%2Fgig%2F377070&amp;ref=https%3A%2F%2Fwww.google.com%2F&amp;tiba=100%2C938%EA%B0%9C%20%EB%A6%AC%EB%B7%B0%EB%A1%9C%20%EC%A6%9D%EB%AA%85%EB%90%9C%2024%2C390%EA%B0%9C%20%EC%9A%B4%EC%84%B8%20%EC%84%9C%EB%B9%84%EC%8A%A4%EB%A5%BC%205%2C000%EC%9B%90%EC%97%90%EC%84%9C%20%EB%B6%80%ED%84%B0%20%EB%A7%8C%EB%82%98%EB%B3%B4%EC%84%B8&amp;hn=www.googleadservices.com&amp;async=1&amp;rfmt=3&amp;fmt=4">
    </script>
<style>
@import url('https://fonts.googleapis.com/css2?family=Jua&display=swap')
	
</style>
</head>
<body>
	
	<!-- ====== Navbar Section Start -->
	
	<header>
		<div
			class="ud-header absolute top-0 left-0 z-40 flex w-full items-center bg-transparent">
			<div class="container">
				<div class="relative -mx-4 flex items-center justify-between">
					<div class="w-60 max-w-full px-4">
						<a href="index.html" class="navbar-logo block w-full py-5"> <img
							src="/1차 프로젝트/img/태린어.png" alt="logo" class="header-logo w-full" />
						</a>
					</div>
					<div class="flex w-full items-center justify-between px-4">
						<div>
							<button id="navbarToggler"
								class="absolute right-4 top-1/2 block -translate-y-1/2 rounded-lg px-3 py-[6px] ring-primary focus:ring-2 lg:hidden">
								<span class="relative my-[6px] block h-[2px] w-[30px] bg-white"></span>
								<span class="relative my-[6px] block h-[2px] w-[30px] bg-white"></span>
								<span class="relative my-[6px] block h-[2px] w-[30px] bg-white"></span>
							</button>
							<nav id="navbarCollapse"
								class="absolute right-4 top-full hidden w-full max-w-[250px] rounded-lg bg-white py-5 shadow-lg lg:static lg:block lg:w-full lg:max-w-full lg:bg-transparent lg:py-0 lg:px-4 lg:shadow-none xl:px-6">
								<ul class="blcok lg:flex">
									<li class="group relative"><a href="#home"
										class="ud-menu-scroll mx-8 flex py-2 text-base text-dark group-hover:text-primary lg:mr-0 lg:inline-flex lg:py-6 lg:px-0 lg:text-white lg:group-hover:text-white lg:group-hover:opacity-70">
											Home </a>
										<div
											class="submenu relative top-full left-0 hidden w-[250px] rounded-sm bg-white p-4 transition-[top] duration-300 group-hover:opacity-100 lg:invisible lg:absolute lg:top-[110%] lg:block lg:opacity-0 lg:shadow-lg lg:group-hover:visible lg:group-hover:top-full">
											<a href="about.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												About Page </a> <a href="pricing.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Pricing Page </a> <a href="contact.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Contact Page </a> <a href="blog-grids.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Blog Grid Page </a> <a href="blog-details.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Blog Details Page </a> <a href="signup.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Sign Up Page </a> <a href="signin.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Sign In Page </a> <a href="404.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												404 Page </a>
										</div></li>
									<li class="group relative"><a href="/#about"
										class="ud-menu-scroll mx-8 flex py-2 text-base text-dark group-hover:text-primary lg:mr-0 lg:ml-7 lg:inline-flex lg:py-6 lg:px-0 lg:text-white lg:group-hover:text-white lg:group-hover:opacity-70 xl:ml-12">
											About </a>
										<div
											class="submenu relative top-full left-0 hidden w-[250px] rounded-sm bg-white p-4 transition-[top] duration-300 group-hover:opacity-100 lg:invisible lg:absolute lg:top-[110%] lg:block lg:opacity-0 lg:shadow-lg lg:group-hover:visible lg:group-hover:top-full">
											<a href="about.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												About Page </a> <a href="pricing.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Pricing Page </a> <a href="contact.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Contact Page </a> <a href="blog-grids.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Blog Grid Page </a> <a href="blog-details.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Blog Details Page </a> <a href="signup.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Sign Up Page </a> <a href="signin.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Sign In Page </a> <a href="404.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												404 Page </a>
										</div></li>
									<li class="group relative"><a href="/#pricing"
										class="ud-menu-scroll mx-8 flex py-2 text-base text-dark group-hover:text-primary lg:mr-0 lg:ml-7 lg:inline-flex lg:py-6 lg:px-0 lg:text-white lg:group-hover:text-white lg:group-hover:opacity-70 xl:ml-12">
											Pricing </a>
										<div
											class="submenu relative top-full left-0 hidden w-[250px] rounded-sm bg-white p-4 transition-[top] duration-300 group-hover:opacity-100 lg:invisible lg:absolute lg:top-[110%] lg:block lg:opacity-0 lg:shadow-lg lg:group-hover:visible lg:group-hover:top-full">
											<a href="about.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												About Page </a> <a href="pricing.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Pricing Page </a> <a href="contact.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Contact Page </a> <a href="blog-grids.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Blog Grid Page </a> <a href="blog-details.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Blog Details Page </a> <a href="signup.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Sign Up Page </a> <a href="signin.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Sign In Page </a> <a href="404.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												404 Page </a>
										</div></li>
									<li class="group relative"><a href="/#team"
										class="ud-menu-scroll mx-8 flex py-2 text-base text-dark group-hover:text-primary lg:mr-0 lg:ml-7 lg:inline-flex lg:py-6 lg:px-0 lg:text-white lg:group-hover:text-white lg:group-hover:opacity-70 xl:ml-12">
											Team </a>
										<div
											class="submenu relative top-full left-0 hidden w-[250px] rounded-sm bg-white p-4 transition-[top] duration-300 group-hover:opacity-100 lg:invisible lg:absolute lg:top-[110%] lg:block lg:opacity-0 lg:shadow-lg lg:group-hover:visible lg:group-hover:top-full">
											<a href="about.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												About Page </a> <a href="pricing.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Pricing Page </a> <a href="contact.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Contact Page </a> <a href="blog-grids.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Blog Grid Page </a> <a href="blog-details.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Blog Details Page </a> <a href="signup.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Sign Up Page </a> <a href="signin.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Sign In Page </a> <a href="404.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												404 Page </a>
										</div></li>
									<li class="group relative"><a href="/#contact"
										class="ud-menu-scroll mx-8 flex py-2 text-base text-dark group-hover:text-primary lg:mr-0 lg:ml-7 lg:inline-flex lg:py-6 lg:px-0 lg:text-white lg:group-hover:text-white lg:group-hover:opacity-70 xl:ml-12">
											Contact </a>
										<div
											class="submenu relative top-full left-0 hidden w-[250px] rounded-sm bg-white p-4 transition-[top] duration-300 group-hover:opacity-100 lg:invisible lg:absolute lg:top-[110%] lg:block lg:opacity-0 lg:shadow-lg lg:group-hover:visible lg:group-hover:top-full">
											<a href="about.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												About Page </a> <a href="pricing.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Pricing Page </a> <a href="contact.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Contact Page </a> <a href="blog-grids.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Blog Grid Page </a> <a href="blog-details.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Blog Details Page </a> <a href="signup.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Sign Up Page </a> <a href="signin.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Sign In Page </a> <a href="404.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												404 Page </a>
										</div></li>
									<li class="submenu-item group relative"><a
										href="javascript:void(0)"
										class="relative mx-8 flex py-2 text-base text-dark after:absolute after:right-1 after:top-1/2 after:mt-[-2px] after:h-2 after:w-2 after:-translate-y-1/2 after:rotate-45 after:border-b-2 after:border-r-2 after:border-current group-hover:text-primary lg:mr-0 lg:ml-8 lg:inline-flex lg:py-6 lg:pl-0 lg:pr-4 lg:text-white lg:after:right-0 lg:group-hover:text-white lg:group-hover:opacity-70 xl:ml-12">
											Pages </a>
										<div
											class="submenu relative top-full left-0 hidden w-[250px] rounded-sm bg-white p-4 transition-[top] duration-300 group-hover:opacity-100 lg:invisible lg:absolute lg:top-[110%] lg:block lg:opacity-0 lg:shadow-lg lg:group-hover:visible lg:group-hover:top-full">
											<a href="about.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												About Page </a> <a href="pricing.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Pricing Page </a> <a href="contact.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Contact Page </a> <a href="blog-grids.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Blog Grid Page </a> <a href="blog-details.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Blog Details Page </a> <a href="signup.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Sign Up Page </a> <a href="signin.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												Sign In Page </a> <a href="404.html"
												class="block rounded py-[10px] px-4 text-sm text-body-color hover:text-primary">
												404 Page </a>
										</div></li>
								</ul>
							</nav>
						</div>
						<div class="hidden justify-end pr-16 sm:flex lg:pr-0">
							<a href="signin.html"
								class="loginBtn py-3 px-7 text-base font-medium text-white hover:opacity-70">
								Sign In </a> <a href="signup.html"
								class="signUpBtn rounded-lg bg-white bg-opacity-20 py-3 px-6 text-base font-medium text-white duration-300 ease-in-out hover:bg-opacity-100 hover:text-dark">
								Sign Up </a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- ====== Navbar Section End -->

		<!-- ====== Banner Section Start -->
		<div
			class="relative z-10 overflow-hidden bg-primary pt-[120px] pb-[100px] md:pt-[130px] lg:pt-[160px]">
			<div class="container">
				<div class="-mx-4 flex flex-wrap items-center">
					<div class="w-full px-4">
						<div class="text-center">
							<h1 class="text-4xl font-semibold text-white"></h1>
						</div>
					</div>
				</div>
			</div>
			<div>
				<span class="absolute top-0 left-0 z-[-1]"> <svg width="495"
						height="470" viewBox="0 0 495 470" fill="none"
						xmlns="http://www.w3.org/2000/svg">
            <circle cx="55" cy="442" r="138" stroke="white"
							stroke-opacity="0.04" stroke-width="50" />
            <circle cx="446" r="39" stroke="white" stroke-opacity="0.04"
							stroke-width="20" />
            <path
							d="M245.406 137.609L233.985 94.9852L276.609 106.406L245.406 137.609Z"
							stroke="white" stroke-opacity="0.08" stroke-width="12" />
          </svg>
				</span> <span class="absolute top-0 right-0 z-[-1]"> <svg
						width="493" height="470" viewBox="0 0 493 470" fill="none"
						xmlns="http://www.w3.org/2000/svg">
            <circle cx="462" cy="5" r="138" stroke="white"
							stroke-opacity="0.04" stroke-width="50" />
            <circle cx="49" cy="470" r="39" stroke="white"
							stroke-opacity="0.04" stroke-width="20" />
            <path
							d="M222.393 226.701L272.808 213.192L259.299 263.607L222.393 226.701Z"
							stroke="white" stroke-opacity="0.06" stroke-width="13" />
          </svg>
				</span>
			</div>
		</div>
	</header>
	<!-- ====== Banner Section End -->

	<!-- ====== Forms Section Start -->
	<section>
	
		<br> <br>
			<div id="__next" data-reactroot="">
			<div class="css-1d3w5wq ex9n9fh0">
				<div class="css-1ouwkcn eyp5lue0">
				
				<form action="WriteTitleCon2" method="post">
					<li>
					<input type="submit" value="작성 완료" />
					</li>
				<!-- </form> -->
					<section class="css-1x2chn8 e1v0089b0">
						<main data-testid="gig-detail-left" class="css-lri68t eagiu670">
							<section data-testid="gig-breadcrumb"
								class="css-nyre5d e17lidep2"></section>
							<!-- <section data-testid="GigMainGallery" class="css-4f82e3 es8oo370"><img
                              data-testid="main-gallery-image"
                              src="/1차 프로젝트/img/2.jpg" width="100%"
                              alt="메인 이미지">
                              </section> -->
							<div class="container">
								<div class="image-upload" id="image-upload">
									<div class="image-show" id="image-show"></div>
									<form method="post" enctype="multipart/form-data">
										<div class="button321">
											<label for="chooseFile"> 👉 사진 업로드하기 👈 </label>
										</div>
										<input type="file" id="chooseFile" name="chooseFile"
											accept="image/*" onchange="loadFile(this)">
									</form>

									<div class="fileContainer">
										<div class="fileInput">
											<p>FILE NAME:</p>
											<p id="fileName"></p>
										</div>
										<div class="buttonContainer">
											<div class="submitButton" id="submitButton">SUBMIT</div>
										</div>
									</div>
								</div>


							</div>
							<nav class="css-isahjz e15sv5ae2">
							<form>
								<div class="css-zjik7 e15sv5ae1">
									<div class="css-1vlymlb e15sv5ae0">서비스 설명</div>
								</div>
							</form>
							</nav>
							<section data-testid="GigTextHTML" class="css-1fui805 e18qb8jq2"
								contenteditable="true">
								<input type="text" name="Caretext1">									
								
							
							</section>
							

							
							
							
							
						</main>
						<aside data-testid="gig-detail-right" class="css-r323iw eskplzy0">
							<section data-testid="GigTitle" class="css-1azpx8r elncoui4">
									
								<input type="text" name="Title" contenteditable="true" placeholder="제목 입력칸" style="height:30px; width:300px; padding-left: 5px;
   										 font-family: 'Jua', sans-serif; font-size:20px"  >
   					
								<div class="css-5raprg elncoui2"></div>
							</section>
							<section data-testid="gig-package-panel"
								class="css-1t5399l esholb95">
								<div class="css-uxzr4j esholb91">
									<!-- <button class="accordion1"> -->
										<!-- <input type="text" name="Price1" contenteditable="true" placeholder="가격 측정" style="display: flex;
    										-webkit-box-align: center; align-items: center; font-size: 18px; font-weight: 700; padding: 20px 30px; background-color: rgb(245, 239, 169) ; transition: max-height 600ms ease 0s;""  onclick="Test2()"
    										class="accordion1"> -->
										<!-- <div class="css-7lzijw esholb94" contenteditable="true">
											가격 측정
										</div> -->
									<!-- </button> -->
								
									<div class="css-mvsxwz esholb93">
										<!-- <div class="css-6bdtcp" id="Test22">
											<input name="Pricetext1" placeholder="설명을 적어주세요" style="color: rgb(182, 182, 182); font-size: 14px; font-weight: 700; max-height: 286px;" data-testid="gig-package-panel-item-title"
												class="css-18jj9yv e188n6b18" contenteditable="true">
												
											<br>
											<div class="css-sv3mbe esholb90">
												<button role="button" color="market"
													class="css-1b6dcge eklkj754">
													<span class="css-1oteowz eklkj753"><span>구매하기</span></span>
												</button>
											</div>
										</div> -->
									</div>
								</div>
								 
								<div class="css-r86f0z esholb91">
									<!-- <button class="accordion1"> -->
										<input type="text" class="css-7lzijw esholb94" placeholder="가격 측정(구독)" name="Price1" contenteditable="true" class="accordion1" style="display: flex;
    										-webkit-box-align: center; align-items: center; font-size: 18px; font-weight: 700; padding: 20px 30px; background-color: rgb(245, 239, 169) ; transition: max-height 600ms ease 0s;"" >
									<!-- </button> -->


									<div class="css-1kvssbm esholb93">
										<div class="css-6bdtcp" id="Test3">
											<div id="2button">
												<input name="Pricetext1" placeholder="설명을 적어주세요" style="color: rgb(182, 182, 182); font-size: 14px; font-weight: 700; max-height: 286px;" data-testid="gig-package-panel-item-title"
												class="css-18jj9yv e188n6b18" contenteditable="true">


												<br>
												<div class="css-sv3mbe esholb90">
													<button role="button" color="market"
														class="css-1b6dcge eklkj754">
														<span class="css-1oteowz eklkj753"><span>구매하기</span></span>
													</button>
												</div>
											</div>
										</div>
									</div>
									</form>
							</section>
						</aside>
					</section>
				</div>
			</div>

			<div id="ad-block" class="css-8ynf6o eojmfk30"></div>
		</div>

		<script>
              console.log("testtest");
              
              
              function Test2(){
                  console.log("tes22");
                  $("#Test3").hide();
                  $("#Test22").show()
              }
              function Test3(){
                      console.log("tex")
                      $("#Test3").show();
                      $("#Test22").hide();
                  
                  }

      </script>

		<script id="__NEXT_DATA__" type="application/json">
      {
          "props": {
              "pageProps": {
                  "$withAuthClient": true
              },
              "__N_SSG": true
          },
          "page": "/seller/become-a-seller",
          "query": {},
          "buildId": "VLdLaZipqQ12M4zSRy1ky",
          "isFallback": false,
          "gsp": true,
          "scriptLoader": []
      }
  </script>
		<script async=""
			src="https://www.googletagmanager.com/gtag/js?id=UA-9241865-16"></script>
		<script>
      window.dataLayer = window.dataLayer || [];

      function gtag() {
          dataLayer.push(arguments);
      }
      gtag('js', new Date());
  </script>
		<script>
      (function (w, d, s, l, i) {
          w[l] = w[l] || [];
          w[l].push({
              'gtm.start': new Date().getTime(),
              event: 'gtm.js'
          });
          var f = d.getElementsByTagName(s)[0],
              j = d.createElement(s),
              dl = l != 'dataLayer' ? '&l=' + l : '';
          j.async = true;
          j.src =
              'https://www.googletagmanager.com/gtm.js?id=' + i + dl;
          f.parentNode.insertBefore(j, f);
      })(window, document, 'script', 'dataLayer', "GTM-M5H79DK");
  </script>
		<script>
      (function (e, t) {
          var r = e.amplitude || {
              _q: [],
              _iq: {}
          };
          var n = t.createElement("script");
          n.type = "text/javascript";
          n.crossOrigin = "anonymous";
          n.async = true;
          n.src = "https://cdn.amplitude.com/libs/amplitude-8.13.0-min.gz.js";
          n.onload = function () {
              if (!e.amplitude.runQueuedFunctions) {
                  console.log("[Amplitude] Error: could not load SDK")
              }
          };
          var s = t.getElementsByTagName("script")[0];
          s.parentNode.insertBefore(n, s);

          function i(e, t) {
              e.prototype[t] = function () {
                  this._q.push([t].concat(Array.prototype.slice.call(arguments, 0)));
                  return this
              }
          }
          var o = function () {
              this._q = [];
              return this
          };
          var a = ["add", "append", "clearAll", "prepend", "set", "setOnce", "unset", "preInsert", "postInsert",
              "remove"
          ];
          for (var c = 0; c < a.length; c++) {
              i(o, a[c])
          }
          r.Identify = o;
          var u = function () {
              this._q = [];
              return this
          };
          var p = ["setProductId", "setQuantity", "setPrice", "setRevenueType", "setEventProperties"];
          for (var l = 0; l < p.length; l++) {
              i(u, p[l])
          }
          r.Revenue = u;
          var d = ["init", "logEvent", "logRevenue", "setUserId", "setUserProperties", "setOptOut",
              "setVersionName", "setDomain", "setDeviceId", "enableTracking", "setGlobalUserProperties",
              "identify", "clearUserProperties", "setGroup", "logRevenueV2", "regenerateDeviceId",
              "groupIdentify", "onInit", "logEventWithTimestamp", "logEventWithGroups", "setSessionId",
              "resetSessionId", "setLibrary", "setTransport"
          ];

          function v(e) {
              function t(t) {
                  e[t] = function () {
                      e._q.push([t].concat(Array.prototype.slice.call(arguments, 0)))
                  }
              }
              for (var r = 0; r < d.length; r++) {
                  t(d[r])
              }
          }
          v(r);
          r.getInstance = function (e) {
              e = (!e || e.length === 0 ? "$default_instance" : e).toLowerCase();
              if (!Object.prototype.hasOwnProperty.call(r._iq, e)) {
                  r._iq[e] = {
                      _q: []
                  };
                  v(r._iq[e])
              }
              return r._iq[e]
          };
          e.amplitude = r
      })(window, document);
      amplitude.getInstance().init("63f6b1b9309a49d21a2bc3c57eb88d41", null, {
          includeUtm: true,
          includeReferrer: true
      });
  </script>
		<script>
      (function (j, en, ni, fer) {
          j['dmndata'] = [];
          j['jenniferFront'] = function (args) {
              window.dmndata.push(args)
          };
          j['dmnaid'] = fer;
          j['dmnatime'] = new Date();
          j['dmnanocookie'] = false;
          j['dmnajennifer'] = 'JENNIFER_FRONT@INTG';
          var b = Math.floor(new Date().getTime() / 60000) * 60000;
          var a = en.createElement(ni);
          a.src = 'https://d-collect.jennifersoft.com/' + fer + '/demian.js?' + b;
          a.async = true;
          en.getElementsByTagName(ni)[0].parentNode.appendChild(a);
      }(window, document, 'script', 'fa906806'));
  </script>
		<script>
      ! function (f, b, e, v, n, t, s) {
          if (f.fbq) return;
          n = f.fbq = function () {
              n.callMethod ?
                  n.callMethod.apply(n, arguments) : n.queue.push(arguments)
          };
          if (!f._fbq) f._fbq = n;
          n.push = n;
          n.loaded = !0;
          n.version = '2.0';
          n.queue = [];
          t = b.createElement(e);
          t.async = !0;
          t.src = v;
          s = b.getElementsByTagName(e)[0];
          s.parentNode.insertBefore(t, s)
      }(window, document, 'script',
          'https://connect.facebook.net/en_US/fbevents.js');
      fbq('init', "167784932188497");
  </script>
		<script type="text/javascript" charset="UTF-8"
			src="https://t1.daumcdn.net/adfit/static/kp.js"></script>
		<script src="//cdn.cresendo.net/Util/fingerprint.min.js"></script>
		<script>
      ! function (w, e) {
          if (w.cre) return;
          e = w.cre = function (i, c, m, n) {
              e.queue.push(arguments);
          };
          e.push = e;
          e.loaded = !0;
          e.queue = [];
      }(window);
      cre('init', 'kmong');
  </script>
		<script src="//cdn.cresendo.net/Track.js"></script>
		<script type="text/javascript" src="https://wcs.naver.net/wcslog.js"></script>
		<script>
      if (typeof wcs !== 'undefined') {
          if (!wcs_add) var wcs_add = {};
          wcs_add["wa"] = "s_5113d520404d";
          if (!_nasa) var _nasa = {};
          wcs.inflow();
          wcs_do(_nasa);
      }
  </script>
		<script>
      _linkedin_partner_id = "3288186";
      window._linkedin_data_partner_ids = window._linkedin_data_partner_ids || [];
      window._linkedin_data_partner_ids.push(_linkedin_partner_id);
  </script>
		<noscript>
			<img height="1" width="1" alt="" style="display: none"
				src="https://px.ads.linkedin.com/collect/?pid=3288186&amp;fmt=gif" />
		</noscript>
		<script type="text/javascript"
			src="https://dnh523js9661q.cloudfront.net/apis/adpick_cps.js?d=7"></script>
		<script>
      ! function (w, d, t) {
          w.TiktokAnalyticsObject = t;
          var ttq = w[t] = w[t] || [];
          ttq.methods = ["page", "track", "identify", "instances", "debug", "on", "off", "once", "ready", "alias",
              "group", "enableCookie", "disableCookie"
          ], ttq.setAndDefer = function (t, e) {
              t[e] = function () {
                  t.push([e].concat(Array.prototype.slice.call(arguments, 0)))
              }
          };
          for (var i = 0; i < ttq.methods.length; i++) ttq.setAndDefer(ttq, ttq.methods[i]);
          ttq.instance = function (t) {
              for (var e = ttq._i[t] || [], n = 0; n < ttq.methods.length; n++) ttq.setAndDefer(e, ttq.methods[
              n]);
              return e
          }, ttq.load = function (e, n) {
              var i = "https://analytics.tiktok.com/i18n/pixel/events.js";
              ttq._i = ttq._i || {}, ttq._i[e] = [], ttq._i[e]._u = i, ttq._t = ttq._t || {}, ttq._t[e] = +
                  new Date, ttq._o = ttq._o || {}, ttq._o[e] = n || {};
              var o = document.createElement("script");
              o.type = "text/javascript", o.async = !0, o.src = i + "?sdkid=" + e + "&lib=" + t;
              var a = document.getElementsByTagName("script")[0];
              a.parentNode.insertBefore(o, a)
          };
      }(window, document, 'ttq');
  </script>
		<script src="//684cdbe490e0498382c72bdc135b168a.js.ubembed.com"
			async=""></script>
		<div class="ub-emb-container">
			<div></div>
		</div>
		<next-route-announcer>
		<p aria-live="assertive" id="__next-route-announcer__" role="alert"
			style="border: 0px; clip: rect(0px, 0px, 0px, 0px); height: 1px; margin: -1px; overflow: hidden; padding: 0px; position: absolute; width: 1px; white-space: nowrap; overflow-wrap: normal;">
			100,938개 리뷰로 증명된 24,390개 운세 서비스를 5,000원에서 부터 만나보세요! | 구해줘 피쉬!</p>
		</next-route-announcer>
		<script src="/_next/static/chunks/3650-c50f13d9a7b7c200.js"></script>
		<script src="/_next/static/chunks/6834-fe39ed9d47e31a37.js"></script>
		<script src="/_next/static/chunks/1905-0086dece1abc636d.js"></script>
		<script src="/_next/static/chunks/7230-c2ced2b0a65fbfbf.js"></script>
		<script src="/_next/static/chunks/pages/index-20e5bc5ba7992469.js"></script>
		<script src="/_next/static/chunks/2194-536bc5b7bd436060.js"></script>
		<script src="/_next/static/chunks/pages/prime-e2d728c58387d3b7.js"></script>
		<script src="/_next/static/chunks/4534-bba4b2a1bf9d5867.js"></script>
		<script
			src="/_next/static/chunks/pages/enterprise-2f12d0d7805f9666.js"></script>
		<script src="/_next/static/chunks/7168-f9b92cd91e1e87d9.js"></script>
		<script
			src="/_next/static/chunks/pages/freelancer-club-653bf5c938b71612.js"></script>
		<style type="text/css" data-typed-js-css="true">
.typed-cursor {
	opacity: 1;
}

.typed-cursor.typed-cursor--blink {
	animation: typedjsBlink 0.7s infinite;
	-webkit-animation: typedjsBlink 0.7s infinite;
	animation: typedjsBlink 0.7s infinite;
}

@
keyframes typedjsBlink { 50% {
	opacity: 0.0;
}

}
@
-webkit-keyframes typedjsBlink { 0% {
	opacity: 1;
}
50


%
{
opacity


:


0
.0
;


}
100


%
{
opacity


:


1
;


}
}
</style>
		<!-- <iframe src="https://bid.g.doubleclick.net/xbbe/pixel?d=KAE" style="display: none;"></iframe><iframe
      src="https://bid.g.doubleclick.net/xbbe/pixel?d=KAE" style="display: none;"></iframe> -->
		<script src="/_next/static/chunks/499-360885571b871b5f.js"></script>
		<script src="/_next/static/chunks/pages/search-7b05a25c71e0035d.js"></script>
		<script
			src="/_next/static/chunks/pages/category/%5BcategoryId%5D-86ada1dbd09ad33c.js"></script>
		<!-- <iframe
      src="https://bid.g.doubleclick.net/xbbe/pixel?d=KAE" style="display: none;"></iframe><iframe
      src="https://bid.g.doubleclick.net/xbbe/pixel?d=KAE" style="display: none;"></iframe> -->
		<script id="ze-snippet"
			src="https://static.zdassets.com/ekr/snippet.js?key=44cf8ba3-8faf-4365-b4ff-8bf1b72e5e25">
   </script>
		<!-- <iframe src="https://bid.g.doubleclick.net/xbbe/pixel?d=KAE" style="display: none;"></iframe><iframe
  //     src="https://bid.g.doubleclick.net/xbbe/pixel?d=KAE" style="display: none;"></iframe><iframe
  //     data-product="web_widget" title="No content" tabindex="-1" aria-hidden="true" src="about:blank"
  //     style="width: 0px; height: 0px; border: 0px; position: absolute; top: -9999px;"></iframe> -->
		<script src="/_next/static/chunks/9741-701e9164dede0314.js"></script>
		<script src="/_next/static/chunks/8879-fcb8afc77ec3949b.js"></script>
		<script src="/_next/static/chunks/8767-8ace0bf6280678cd.js"></script>
		<script src="/_next/static/chunks/6232-7e6d25e8743e3548.js"></script>
		<script src="/_next/static/chunks/1247-9f30cd56f13e5e6a.js"></script>
		<script src="/_next/static/chunks/7250-f94a9a6b6d700a71.js"></script>
		<script src="/_next/static/chunks/8944-609c35d84deb0762.js"></script>
		<script src="/_next/static/chunks/8299-6f024e428dfa46b9.js"></script>
		<script
			src="/_next/static/chunks/pages/gig/%5BPID%5D-fed09cf1c962941f.js"></script>
		<!-- <iframe src="https://bid.g.doubleclick.net/xbbe/pixel?d=KAE" style="display: none;"></iframe>
  <iframe src="https://bid.g.doubleclick.net/xbbe/pixel?d=KAE" style="display: none;"></iframe> -->
		<section data-testid="GigBottomFixedPackagePanel"
			class="css-15ydrju eyphdba18"></section>
		<script>
      var acc = document.getElementsByClassName("accordion1");
      for (var i = 0; i < acc.length; i++) {
  
          acc[i].onclick = function() {	 
               // 클릭이 일어났을 때 기존에 열려 있던 아코디언을 접는다. (1개의 아코디언만 열리게)
              for (var j = 0 ; j<acc.length; j++){
                  // 버튼 상태에 입혀진 active 라는 클래스를 지운다.
                  acc[j].classList.remove("active");
                  // 버튼 다음에 있는 div 콘텐츠 높이를 0으로 만든다. == 아코디언을 접는다.
                  if (this!==acc[j]) {
                      acc[j].nextElementSibling.style.maxHeight = null;
                  }
              }
  
              this.classList.toggle("active");
              var panel = this.nextElementSibling;
              if (panel.style.maxHeight){
                  this.classList.remove("active");
                  panel.style.maxHeight = null;
              } else {
                  panel.style.maxHeight = panel.scrollHeight + "px";
              }
          }
      }
      </script>
		
		<script>
    (function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':
            new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
        j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
        'https://www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
    })(window,document,'script','dataLayer',"GTM-M5H79DK");
    (function(e,t){var r=e.amplitude||{_q:[],_iq:{}};var n=t.createElement("script")
    ;n.type="text/javascript"
    ;n.crossOrigin="anonymous";n.async=true
    ;n.src="https://cdn.amplitude.com/libs/amplitude-8.13.0-min.gz.js"
    ;n.onload=function(){if(!e.amplitude.runQueuedFunctions){
    console.log("[Amplitude] Error: could not load SDK")}}
    ;var s=t.getElementsByTagName("script")[0];s.parentNode.insertBefore(n,s)
    ;function i(e,t){e.prototype[t]=function(){
    this._q.push([t].concat(Array.prototype.slice.call(arguments,0)));return this}}
    var o=function(){this._q=[];return this}
    ;var a=["add","append","clearAll","prepend","set","setOnce","unset","preInsert","postInsert","remove"]
    ;for(var c=0;c<a.length;c++){i(o,a[c])}r.Identify=o;var u=function(){this._q=[]
    ;return this}
    ;var p=["setProductId","setQuantity","setPrice","setRevenueType","setEventProperties"]
    ;for(var l=0;l<p.length;l++){i(u,p[l])}r.Revenue=u
    ;var d=["init","logEvent","logRevenue","setUserId","setUserProperties","setOptOut","setVersionName","setDomain","setDeviceId","enableTracking","setGlobalUserProperties","identify","clearUserProperties","setGroup","logRevenueV2","regenerateDeviceId","groupIdentify","onInit","logEventWithTimestamp","logEventWithGroups","setSessionId","resetSessionId","setLibrary","setTransport"]
    ;function v(e){function t(t){e[t]=function(){
    e._q.push([t].concat(Array.prototype.slice.call(arguments,0)))}}
    for(var r=0;r<d.length;r++){t(d[r])}}v(r);r.getInstance=function(e){
    e=(!e||e.length===0?"$default_instance":e).toLowerCase()
    ;if(!Object.prototype.hasOwnProperty.call(r._iq,e)){r._iq[e]={_q:[]};v(r._iq[e])
    }return r._iq[e]};e.amplitude=r})(window,document);
      amplitude.getInstance().init("63f6b1b9309a49d21a2bc3c57eb88d41", null, {includeUtm:true,includeReferrer:true});
  </script>
		<script>
(function(j,en,ni,fer) {
  j['dmndata']=[];j['jenniferFront']=function(args){window.dmndata.push(args)};
  j['dmnaid']=fer;j['dmnatime']=new Date();j['dmnanocookie']=false;j['dmnajennifer']='JENNIFER_FRONT@INTG';
  var b=Math.floor(new Date().getTime() / 60000) * 60000;var a=en.createElement(ni);
  a.src='https://d-collect.jennifersoft.com/'+fer+'/demian.js?'+b;a.async=true;
  en.getElementsByTagName(ni)[0].parentNode.appendChild(a);
}(window,document,'script','fa906806'));
</script>
		<script>
        !function(f,b,e,v,n,t,s)
        {if(f.fbq)return;n=f.fbq=function(){n.callMethod?
            n.callMethod.apply(n,arguments):n.queue.push(arguments)};
            if(!f._fbq)f._fbq=n;n.push=n;n.loaded=!0;n.version='2.0';
            n.queue=[];t=b.createElement(e);t.async=!0;
            t.src=v;s=b.getElementsByTagName(e)[0];
            s.parentNode.insertBefore(t,s)}(window, document,'script',
            'https://connect.facebook.net/en_US/fbevents.js');
            fbq('init', "167784932188497");
  </script>
		<script type="text/javascript" charSet="UTF-8"
			src="https://t1.daumcdn.net/adfit/static/kp.js"></script>
		<script src="//cdn.cresendo.net/Util/fingerprint.min.js"></script>
		<script>
    !function(w,e){if(w.cre) return;
        e=w.cre=function(i,c,m,n){e.queue.push(arguments);};
        e.push=e;e.loaded=!0;e.queue=[];}(window);
    cre('init','kmong');
  </script>
		<script src="//cdn.cresendo.net/Track.js"></script>
		<script type="text/javascript" src="https://wcs.naver.net/wcslog.js"></script>
		<script>
    if (typeof wcs !== 'undefined') {
        if (!wcs_add) var wcs_add={};
        wcs_add["wa"] = "s_5113d520404d";
        if (!_nasa) var _nasa={};
        wcs.inflow();
        wcs_do(_nasa);
    }
  </script>
		<script>
_linkedin_partner_id = "3288186";
window._linkedin_data_partner_ids = window._linkedin_data_partner_ids || [];
window._linkedin_data_partner_ids.push(_linkedin_partner_id);
</script>
		<script>
(function(l) {
if (!l){window.lintrk = function(a,b){window.lintrk.q.push([a,b])};
window.lintrk.q=[]}
var s = document.getElementsByTagName("script")[0];
var b = document.createElement("script");
b.type = "text/javascript";b.async = true;
b.src = "https://snap.licdn.com/li.lms-analytics/insight.min.js";
s.parentNode.insertBefore(b, s);})(window.lintrk);
</script>
		<noscript>
			<img height="1" width="1" alt="" style="display: none"
				src="https://px.ads.linkedin.com/collect/?pid=3288186&amp;fmt=gif" />
		</noscript>
		<script type="text/javascript"
			src="https://dnh523js9661q.cloudfront.net/apis/adpick_cps.js?d=7"></script>
		<script>
!function (w, d, t) {
  w.TiktokAnalyticsObject=t;var ttq=w[t]=w[t]||[];ttq.methods=["page","track","identify","instances","debug","on","off","once","ready","alias","group","enableCookie","disableCookie"],ttq.setAndDefer=function(t,e){t[e]=function(){t.push([e].concat(Array.prototype.slice.call(arguments,0)))}};for(var i=0;i<ttq.methods.length;i++)ttq.setAndDefer(ttq,ttq.methods[i]);ttq.instance=function(t){for(var e=ttq._i[t]||[],n=0;n<ttq.methods.length;n++)ttq.setAndDefer(e,ttq.methods[n]);return e},ttq.load=function(e,n){var i="https://analytics.tiktok.com/i18n/pixel/events.js";ttq._i=ttq._i||{},ttq._i[e]=[],ttq._i[e]._u=i,ttq._t=ttq._t||{},ttq._t[e]=+new Date,ttq._o=ttq._o||{},ttq._o[e]=n||{};var o=document.createElement("script");o.type="text/javascript",o.async=!0,o.src=i+"?sdkid="+e+"&lib="+t;var a=document.getElementsByTagName("script")[0];a.parentNode.insertBefore(o,a)};
}(window, document, 'ttq');
</script>

		<script src="//684cdbe490e0498382c72bdc135b168a.js.ubembed.com"
			async=""></script>




	</section>
	<!-- ====== Forms Section End -->

	<!-- ====== Footer Section Start -->
	<footer class="wow fadeInUp relative z-10 bg-black pt-20 lg:pt-[120px]"
		data-wow-delay=".15s">
		<div class="container">
			<div class="-mx-4 flex flex-wrap">
				<div class="w-full px-4 sm:w-1/2 md:w-1/2 lg:w-4/12 xl:w-3/12">
					<div class="mb-10 w-full">
						<a href="javascript:void(0)"
							class="mb-6 inline-block max-w-[160px]"> <img
							src="assets/images/logo/logo-white.svg" alt="logo"
							class="max-w-full" />
						</a>
						<p class="mb-7 text-base text-[#f3f4fe]">We create digital
							experiences for brands and companies by using technology.</p>
						<div class="-mx-3 flex items-center">
							<a href="javascript:void(0)"
								class="px-3 text-[#dddddd] hover:text-white"> <svg
									width="10" height="18" viewBox="0 0 10 18" class="fill-current">
                    <path
										d="M9.00007 6.82105H7.50006H6.96434V6.27097V4.56571V4.01562H7.50006H8.62507C8.91971 4.01562 9.16078 3.79559 9.16078 3.46554V0.550085C9.16078 0.247538 8.9465 0 8.62507 0H6.66969C4.55361 0 3.08038 1.54024 3.08038 3.82309V6.21596V6.76605H2.54466H0.72322C0.348217 6.76605 0 7.06859 0 7.50866V9.48897C0 9.87402 0.294645 10.2316 0.72322 10.2316H2.49109H3.02681V10.7817V16.31C3.02681 16.6951 3.32145 17.0526 3.75003 17.0526H6.26791C6.42862 17.0526 6.56255 16.9701 6.66969 16.8601C6.77684 16.7501 6.8572 16.5576 6.8572 16.3925V10.8092V10.2591H7.4197H8.62507C8.97328 10.2591 9.24114 10.0391 9.29471 9.709V9.6815V9.65399L9.66972 7.7562C9.6965 7.56367 9.66972 7.34363 9.509 7.1236C9.45543 6.98608 9.21436 6.84856 9.00007 6.82105Z" />
                  </svg>
							</a> <a href="javascript:void(0)"
								class="px-3 text-[#dddddd] hover:text-white"> <svg
									width="19" height="15" viewBox="0 0 19 15" class="fill-current">
                    <path
										d="M16.2622 3.17878L17.33 1.93293C17.6391 1.59551 17.7234 1.33595 17.7515 1.20618C16.9085 1.67337 16.1217 1.82911 15.6159 1.82911H15.4192L15.3068 1.72528C14.6324 1.18022 13.7894 0.894714 12.8902 0.894714C10.9233 0.894714 9.37779 2.40012 9.37779 4.13913C9.37779 4.24295 9.37779 4.39868 9.40589 4.5025L9.49019 5.02161L8.90009 4.99565C5.30334 4.89183 2.35288 2.03675 1.87518 1.5436C1.08839 2.84136 1.53799 4.08722 2.01568 4.86587L2.97107 6.31937L1.45369 5.54071C1.48179 6.63084 1.93138 7.48736 2.80247 8.11029L3.56116 8.62939L2.80247 8.9149C3.28017 10.2386 4.34795 10.7837 5.13474 10.9913L6.17443 11.2509L5.19094 11.8738C3.61736 12.912 1.65039 12.8342 0.779297 12.7563C2.54957 13.8983 4.65705 14.1579 6.11823 14.1579C7.21412 14.1579 8.02901 14.0541 8.2257 13.9762C16.0936 12.2631 16.4589 5.77431 16.4589 4.47655V4.29486L16.6275 4.19104C17.5829 3.36047 17.9763 2.91923 18.2011 2.65967C18.1168 2.68563 18.0044 2.73754 17.892 2.7635L16.2622 3.17878Z" />
                  </svg>
							</a> <a href="javascript:void(0)"
								class="px-3 text-[#dddddd] hover:text-white"> <svg
									width="18" height="18" viewBox="0 0 18 18" class="fill-current">
                    <path
										d="M8.91688 12.4995C10.6918 12.4995 12.1306 11.0911 12.1306 9.35385C12.1306 7.61655 10.6918 6.20819 8.91688 6.20819C7.14197 6.20819 5.70312 7.61655 5.70312 9.35385C5.70312 11.0911 7.14197 12.4995 8.91688 12.4995Z" />
                    <path
										d="M12.4078 0.947388H5.37075C2.57257 0.947388 0.300781 3.17104 0.300781 5.90993V12.7436C0.300781 15.5367 2.57257 17.7604 5.37075 17.7604H12.3524C15.2059 17.7604 17.4777 15.5367 17.4777 12.7978V5.90993C17.4777 3.17104 15.2059 0.947388 12.4078 0.947388ZM8.91696 13.4758C6.56206 13.4758 4.70584 11.6047 4.70584 9.35389C4.70584 7.10312 6.58976 5.23199 8.91696 5.23199C11.2165 5.23199 13.1004 7.10312 13.1004 9.35389C13.1004 11.6047 11.2442 13.4758 8.91696 13.4758ZM14.735 5.61164C14.4579 5.90993 14.0423 6.07264 13.5714 6.07264C13.1558 6.07264 12.7402 5.90993 12.4078 5.61164C12.103 5.31334 11.9368 4.9337 11.9368 4.47269C11.9368 4.01169 12.103 3.65916 12.4078 3.33375C12.7125 3.00834 13.1004 2.84563 13.5714 2.84563C13.9869 2.84563 14.4302 3.00834 14.735 3.30663C15.012 3.65916 15.2059 4.06593 15.2059 4.49981C15.1782 4.9337 15.012 5.31334 14.735 5.61164Z" />
                    <path
										d="M13.5985 3.82184C13.2383 3.82184 12.9336 4.12013 12.9336 4.47266C12.9336 4.82519 13.2383 5.12349 13.5985 5.12349C13.9587 5.12349 14.2634 4.82519 14.2634 4.47266C14.2634 4.12013 13.9864 3.82184 13.5985 3.82184Z" />
                  </svg>
							</a> <a href="javascript:void(0)"
								class="px-3 text-[#dddddd] hover:text-white"> <svg
									width="18" height="18" viewBox="0 0 18 18" class="fill-current">
                    <path
										d="M16.7821 0.947388H1.84847C1.14272 0.947388 0.578125 1.49747 0.578125 2.18508V16.7623C0.578125 17.4224 1.14272 18 1.84847 18H16.7257C17.4314 18 17.996 17.4499 17.996 16.7623V2.15757C18.0525 1.49747 17.4879 0.947388 16.7821 0.947388ZM5.7442 15.4421H3.17528V7.32837H5.7442V15.4421ZM4.44563 6.2007C3.59873 6.2007 2.94944 5.5406 2.94944 4.74297C2.94944 3.94535 3.62696 3.28525 4.44563 3.28525C5.26429 3.28525 5.94181 3.94535 5.94181 4.74297C5.94181 5.5406 5.32075 6.2007 4.44563 6.2007ZM15.4835 15.4421H12.9146V11.509C12.9146 10.5739 12.8864 9.33618 11.5596 9.33618C10.2045 9.33618 10.0069 10.3813 10.0069 11.4265V15.4421H7.438V7.32837H9.95046V8.45605H9.9787C10.3457 7.79594 11.1644 7.13584 12.4347 7.13584C15.0601 7.13584 15.54 8.7861 15.54 11.0414V15.4421H15.4835Z" />
                  </svg>
							</a>
						</div>
					</div>
				</div>
				<div class="w-full px-4 sm:w-1/2 md:w-1/2 lg:w-2/12 xl:w-2/12">
					<div class="mb-10 w-full">
						<h4 class="mb-9 text-lg font-semibold text-white">About Us</h4>
						<ul>
							<li><a href="javascript:void(0)"
								class="mb-2 inline-block text-base leading-loose text-[#f3f4fe] hover:text-primary">
									Home </a></li>
							<li><a href="javascript:void(0)"
								class="mb-2 inline-block text-base leading-loose text-[#f3f4fe] hover:text-primary">
									Features </a></li>
							<li><a href="javascript:void(0)"
								class="mb-2 inline-block text-base leading-loose text-[#f3f4fe] hover:text-primary">
									About </a></li>
							<li><a href="javascript:void(0)"
								class="mb-2 inline-block text-base leading-loose text-[#f3f4fe] hover:text-primary">
									Testimonial </a></li>
						</ul>
					</div>
				</div>
				<div class="w-full px-4 sm:w-1/2 md:w-1/2 lg:w-3/12 xl:w-2/12">
					<div class="mb-10 w-full">
						<h4 class="mb-9 text-lg font-semibold text-white">Features</h4>
						<ul>
							<li><a href="javascript:void(0)"
								class="mb-2 inline-block text-base leading-loose text-[#f3f4fe] hover:text-primary">
									How it works </a></li>
							<li><a href="javascript:void(0)"
								class="mb-2 inline-block text-base leading-loose text-[#f3f4fe] hover:text-primary">
									Privacy policy </a></li>
							<li><a href="javascript:void(0)"
								class="mb-2 inline-block text-base leading-loose text-[#f3f4fe] hover:text-primary">
									Terms of Service </a></li>
							<li><a href="javascript:void(0)"
								class="mb-2 inline-block text-base leading-loose text-[#f3f4fe] hover:text-primary">
									Refund policy </a></li>
						</ul>
					</div>
				</div>
				<div class="w-full px-4 sm:w-1/2 md:w-1/2 lg:w-3/12 xl:w-2/12">
					<div class="mb-10 w-full">
						<h4 class="mb-9 text-lg font-semibold text-white">Our
							Products</h4>
						<ul>
							<li><a href="javascript:void(0)"
								class="mb-2 inline-block text-base leading-loose text-[#f3f4fe] hover:text-primary">
									LineIcons </a></li>
							<li><a href="javascript:void(0)"
								class="mb-2 inline-block text-base leading-loose text-[#f3f4fe] hover:text-primary">
									Ecommerce HTML </a></li>
							<li><a href="javascript:void(0)"
								class="mb-2 inline-block text-base leading-loose text-[#f3f4fe] hover:text-primary">
									Ayro UI </a></li>
							<li><a href="javascript:void(0)"
								class="mb-2 inline-block text-base leading-loose text-[#f3f4fe] hover:text-primary">
									PlainAdmin </a></li>
						</ul>
					</div>
				</div>
				<div class="w-full px-4 md:w-2/3 lg:w-6/12 xl:w-3/12">
					<div class="mb-10 w-full">
						<h4 class="mb-9 text-lg font-semibold text-white">Partners</h4>
						<ul class="flex flex-wrap items-center">
							<li><a href="https://tailgrids.com" rel="nofollow noopner"
								target="_blank"
								class="mb-6 mr-5 block max-w-[120px] xl:max-w-[100px] 2xl:max-w-[120px]">
									<img src="assets/images/footer/brands/tailgrids.svg"
									alt="tailgrids" />
							</a></li>
							<li><a href="https://ayroui.com" rel="nofollow noopner"
								target="_blank"
								class="mb-6 mr-5 block max-w-[120px] xl:max-w-[100px] 2xl:max-w-[120px]">
									<img src="assets/images/footer/brands/ayroui.svg" alt="ayroui" />
							</a></li>
							<li><a href="https://ecommercehtml.com"
								rel="nofollow noopner" target="_blank"
								class="mb-6 mr-5 block max-w-[120px] xl:max-w-[100px] 2xl:max-w-[120px]">
									<img src="assets/images/footer/brands/ecommerce-html.svg"
									alt="ecommerce-html" />
							</a></li>
							<li><a href="https://graygrids.com" rel="nofollow noopner"
								target="_blank"
								class="mb-6 mr-5 block max-w-[120px] xl:max-w-[100px] 2xl:max-w-[120px]">
									<img src="assets/images/footer/brands/graygrids.svg"
									alt="graygrids" />
							</a></li>
							<li><a href="https://lineicons.com" rel="nofollow noopner"
								target="_blank"
								class="mb-6 mr-5 block max-w-[120px] xl:max-w-[100px] 2xl:max-w-[120px]">
									<img src="assets/images/footer/brands/lineicons.svg"
									alt="lineicons" />
							</a></li>
							<li><a href="https://uideck.com" rel="nofollow noopner"
								target="_blank"
								class="mb-6 mr-5 block max-w-[120px] xl:max-w-[100px] 2xl:max-w-[120px]">
									<img src="assets/images/footer/brands/uideck.svg" alt="uideck" />
							</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<div class="mt-12 border-t border-opacity-40 py-8 lg:mt-[60px]">
			<div class="container">
				<div class="-mx-4 flex flex-wrap">
					<div class="w-full px-4 md:w-2/3 lg:w-1/2">
						<div class="my-1">
							<div
								class="-mx-3 flex items-center justify-center md:justify-start">
								<a href="javascript:void(0)"
									class="px-3 text-base text-[#f3f4fe] hover:text-primary">
									Privacy policy </a> <a href="javascript:void(0)"
									class="px-3 text-base text-[#f3f4fe] hover:text-primary">
									Legal notice </a> <a href="javascript:void(0)"
									class="px-3 text-base text-[#f3f4fe] hover:text-primary">
									Terms of service </a>
							</div>
						</div>
					</div>
					<div class="w-full px-4 md:w-1/3 lg:w-1/2">
						<div class="my-1 flex justify-center md:justify-end">
							<p class="text-base text-[#f3f4fe]">
								Designed and Developed by <a href="https://tailgrids.com"
									rel="nofollow noopner" target="_blank"
									class="text-primary hover:underline"> TailGrids and UIdeck
								</a>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div>
			<span class="absolute left-0 top-0 z-[-1]"> <img
				src="assets/images/footer/shape-1.svg" alt="" />
			</span> <span class="absolute bottom-0 right-0 z-[-1]"> <img
				src="assets/images/footer/shape-3.svg" alt="" />
			</span> <span class="absolute top-0 right-0 z-[-1]"> <svg width="102"
					height="102" viewBox="0 0 102 102" fill="none"
					xmlns="http://www.w3.org/2000/svg">
            <path
						d="M1.8667 33.1956C2.89765 33.1956 3.7334 34.0318 3.7334 35.0633C3.7334 36.0947 2.89765 36.9309 1.8667 36.9309C0.835744 36.9309 4.50645e-08 36.0947 0 35.0633C-4.50645e-08 34.0318 0.835744 33.1956 1.8667 33.1956Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M18.2939 33.1956C19.3249 33.1956 20.1606 34.0318 20.1606 35.0633C20.1606 36.0947 19.3249 36.9309 18.2939 36.9309C17.263 36.9309 16.4272 36.0947 16.4272 35.0633C16.4272 34.0318 17.263 33.1956 18.2939 33.1956Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M34.7209 33.195C35.7519 33.195 36.5876 34.0311 36.5876 35.0626C36.5876 36.0941 35.7519 36.9303 34.7209 36.9303C33.69 36.9303 32.8542 36.0941 32.8542 35.0626C32.8542 34.0311 33.69 33.195 34.7209 33.195Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M50.9341 33.195C51.965 33.195 52.8008 34.0311 52.8008 35.0626C52.8008 36.0941 51.965 36.9303 50.9341 36.9303C49.9031 36.9303 49.0674 36.0941 49.0674 35.0626C49.0674 34.0311 49.9031 33.195 50.9341 33.195Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M1.8667 16.7605C2.89765 16.7605 3.7334 17.5966 3.7334 18.6281C3.7334 19.6596 2.89765 20.4957 1.8667 20.4957C0.835744 20.4957 4.50645e-08 19.6596 0 18.6281C-4.50645e-08 17.5966 0.835744 16.7605 1.8667 16.7605Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M18.2939 16.7605C19.3249 16.7605 20.1606 17.5966 20.1606 18.6281C20.1606 19.6596 19.3249 20.4957 18.2939 20.4957C17.263 20.4957 16.4272 19.6596 16.4272 18.6281C16.4272 17.5966 17.263 16.7605 18.2939 16.7605Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M34.7209 16.7605C35.7519 16.7605 36.5876 17.5966 36.5876 18.6281C36.5876 19.6596 35.7519 20.4957 34.7209 20.4957C33.69 20.4957 32.8542 19.6596 32.8542 18.6281C32.8542 17.5966 33.69 16.7605 34.7209 16.7605Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M50.9341 16.7605C51.965 16.7605 52.8008 17.5966 52.8008 18.6281C52.8008 19.6596 51.965 20.4957 50.9341 20.4957C49.9031 20.4957 49.0674 19.6596 49.0674 18.6281C49.0674 17.5966 49.9031 16.7605 50.9341 16.7605Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M1.8667 0.324951C2.89765 0.324951 3.7334 1.16115 3.7334 2.19261C3.7334 3.22408 2.89765 4.06024 1.8667 4.06024C0.835744 4.06024 4.50645e-08 3.22408 0 2.19261C-4.50645e-08 1.16115 0.835744 0.324951 1.8667 0.324951Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M18.2939 0.324951C19.3249 0.324951 20.1606 1.16115 20.1606 2.19261C20.1606 3.22408 19.3249 4.06024 18.2939 4.06024C17.263 4.06024 16.4272 3.22408 16.4272 2.19261C16.4272 1.16115 17.263 0.324951 18.2939 0.324951Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M34.7209 0.325302C35.7519 0.325302 36.5876 1.16147 36.5876 2.19293C36.5876 3.2244 35.7519 4.06056 34.7209 4.06056C33.69 4.06056 32.8542 3.2244 32.8542 2.19293C32.8542 1.16147 33.69 0.325302 34.7209 0.325302Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M50.9341 0.325302C51.965 0.325302 52.8008 1.16147 52.8008 2.19293C52.8008 3.2244 51.965 4.06056 50.9341 4.06056C49.9031 4.06056 49.0674 3.2244 49.0674 2.19293C49.0674 1.16147 49.9031 0.325302 50.9341 0.325302Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M66.9037 33.1956C67.9346 33.1956 68.7704 34.0318 68.7704 35.0633C68.7704 36.0947 67.9346 36.9309 66.9037 36.9309C65.8727 36.9309 65.037 36.0947 65.037 35.0633C65.037 34.0318 65.8727 33.1956 66.9037 33.1956Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M83.3307 33.1956C84.3616 33.1956 85.1974 34.0318 85.1974 35.0633C85.1974 36.0947 84.3616 36.9309 83.3307 36.9309C82.2997 36.9309 81.464 36.0947 81.464 35.0633C81.464 34.0318 82.2997 33.1956 83.3307 33.1956Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M99.7576 33.1956C100.789 33.1956 101.624 34.0318 101.624 35.0633C101.624 36.0947 100.789 36.9309 99.7576 36.9309C98.7266 36.9309 97.8909 36.0947 97.8909 35.0633C97.8909 34.0318 98.7266 33.1956 99.7576 33.1956Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M66.9037 16.7605C67.9346 16.7605 68.7704 17.5966 68.7704 18.6281C68.7704 19.6596 67.9346 20.4957 66.9037 20.4957C65.8727 20.4957 65.037 19.6596 65.037 18.6281C65.037 17.5966 65.8727 16.7605 66.9037 16.7605Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M83.3307 16.7605C84.3616 16.7605 85.1974 17.5966 85.1974 18.6281C85.1974 19.6596 84.3616 20.4957 83.3307 20.4957C82.2997 20.4957 81.464 19.6596 81.464 18.6281C81.464 17.5966 82.2997 16.7605 83.3307 16.7605Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M99.7576 16.7605C100.789 16.7605 101.624 17.5966 101.624 18.6281C101.624 19.6596 100.789 20.4957 99.7576 20.4957C98.7266 20.4957 97.8909 19.6596 97.8909 18.6281C97.8909 17.5966 98.7266 16.7605 99.7576 16.7605Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M66.9037 0.324966C67.9346 0.324966 68.7704 1.16115 68.7704 2.19261C68.7704 3.22408 67.9346 4.06024 66.9037 4.06024C65.8727 4.06024 65.037 3.22408 65.037 2.19261C65.037 1.16115 65.8727 0.324966 66.9037 0.324966Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M83.3307 0.324951C84.3616 0.324951 85.1974 1.16115 85.1974 2.19261C85.1974 3.22408 84.3616 4.06024 83.3307 4.06024C82.2997 4.06024 81.464 3.22408 81.464 2.19261C81.464 1.16115 82.2997 0.324951 83.3307 0.324951Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M99.7576 0.324951C100.789 0.324951 101.624 1.16115 101.624 2.19261C101.624 3.22408 100.789 4.06024 99.7576 4.06024C98.7266 4.06024 97.8909 3.22408 97.8909 2.19261C97.8909 1.16115 98.7266 0.324951 99.7576 0.324951Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M1.8667 82.2029C2.89765 82.2029 3.7334 83.039 3.7334 84.0705C3.7334 85.102 2.89765 85.9382 1.8667 85.9382C0.835744 85.9382 4.50645e-08 85.102 0 84.0705C-4.50645e-08 83.039 0.835744 82.2029 1.8667 82.2029Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M18.2939 82.2029C19.3249 82.2029 20.1606 83.039 20.1606 84.0705C20.1606 85.102 19.3249 85.9382 18.2939 85.9382C17.263 85.9382 16.4272 85.102 16.4272 84.0705C16.4272 83.039 17.263 82.2029 18.2939 82.2029Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M34.7209 82.2026C35.7519 82.2026 36.5876 83.0387 36.5876 84.0702C36.5876 85.1017 35.7519 85.9378 34.7209 85.9378C33.69 85.9378 32.8542 85.1017 32.8542 84.0702C32.8542 83.0387 33.69 82.2026 34.7209 82.2026Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M50.9341 82.2026C51.965 82.2026 52.8008 83.0387 52.8008 84.0702C52.8008 85.1017 51.965 85.9378 50.9341 85.9378C49.9031 85.9378 49.0674 85.1017 49.0674 84.0702C49.0674 83.0387 49.9031 82.2026 50.9341 82.2026Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M1.8667 65.7677C2.89765 65.7677 3.7334 66.6039 3.7334 67.6353C3.7334 68.6668 2.89765 69.503 1.8667 69.503C0.835744 69.503 4.50645e-08 68.6668 0 67.6353C-4.50645e-08 66.6039 0.835744 65.7677 1.8667 65.7677Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M18.2939 65.7677C19.3249 65.7677 20.1606 66.6039 20.1606 67.6353C20.1606 68.6668 19.3249 69.503 18.2939 69.503C17.263 69.503 16.4272 68.6668 16.4272 67.6353C16.4272 66.6039 17.263 65.7677 18.2939 65.7677Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M34.7209 65.7674C35.7519 65.7674 36.5876 66.6036 36.5876 67.635C36.5876 68.6665 35.7519 69.5027 34.7209 69.5027C33.69 69.5027 32.8542 68.6665 32.8542 67.635C32.8542 66.6036 33.69 65.7674 34.7209 65.7674Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M50.9341 65.7674C51.965 65.7674 52.8008 66.6036 52.8008 67.635C52.8008 68.6665 51.965 69.5027 50.9341 69.5027C49.9031 69.5027 49.0674 68.6665 49.0674 67.635C49.0674 66.6036 49.9031 65.7674 50.9341 65.7674Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M1.8667 98.2644C2.89765 98.2644 3.7334 99.1005 3.7334 100.132C3.7334 101.163 2.89765 102 1.8667 102C0.835744 102 4.50645e-08 101.163 0 100.132C-4.50645e-08 99.1005 0.835744 98.2644 1.8667 98.2644Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M1.8667 49.3322C2.89765 49.3322 3.7334 50.1684 3.7334 51.1998C3.7334 52.2313 2.89765 53.0675 1.8667 53.0675C0.835744 53.0675 4.50645e-08 52.2313 0 51.1998C-4.50645e-08 50.1684 0.835744 49.3322 1.8667 49.3322Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M18.2939 98.2644C19.3249 98.2644 20.1606 99.1005 20.1606 100.132C20.1606 101.163 19.3249 102 18.2939 102C17.263 102 16.4272 101.163 16.4272 100.132C16.4272 99.1005 17.263 98.2644 18.2939 98.2644Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M18.2939 49.3322C19.3249 49.3322 20.1606 50.1684 20.1606 51.1998C20.1606 52.2313 19.3249 53.0675 18.2939 53.0675C17.263 53.0675 16.4272 52.2313 16.4272 51.1998C16.4272 50.1684 17.263 49.3322 18.2939 49.3322Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M34.7209 98.2647C35.7519 98.2647 36.5876 99.1008 36.5876 100.132C36.5876 101.164 35.7519 102 34.7209 102C33.69 102 32.8542 101.164 32.8542 100.132C32.8542 99.1008 33.69 98.2647 34.7209 98.2647Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M50.9341 98.2647C51.965 98.2647 52.8008 99.1008 52.8008 100.132C52.8008 101.164 51.965 102 50.9341 102C49.9031 102 49.0674 101.164 49.0674 100.132C49.0674 99.1008 49.9031 98.2647 50.9341 98.2647Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M34.7209 49.3326C35.7519 49.3326 36.5876 50.1687 36.5876 51.2002C36.5876 52.2317 35.7519 53.0678 34.7209 53.0678C33.69 53.0678 32.8542 52.2317 32.8542 51.2002C32.8542 50.1687 33.69 49.3326 34.7209 49.3326Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M50.9341 49.3326C51.965 49.3326 52.8008 50.1687 52.8008 51.2002C52.8008 52.2317 51.965 53.0678 50.9341 53.0678C49.9031 53.0678 49.0674 52.2317 49.0674 51.2002C49.0674 50.1687 49.9031 49.3326 50.9341 49.3326Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M66.9037 82.2029C67.9346 82.2029 68.7704 83.0391 68.7704 84.0705C68.7704 85.102 67.9346 85.9382 66.9037 85.9382C65.8727 85.9382 65.037 85.102 65.037 84.0705C65.037 83.0391 65.8727 82.2029 66.9037 82.2029Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M83.3307 82.2029C84.3616 82.2029 85.1974 83.0391 85.1974 84.0705C85.1974 85.102 84.3616 85.9382 83.3307 85.9382C82.2997 85.9382 81.464 85.102 81.464 84.0705C81.464 83.0391 82.2997 82.2029 83.3307 82.2029Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M99.7576 82.2029C100.789 82.2029 101.624 83.039 101.624 84.0705C101.624 85.102 100.789 85.9382 99.7576 85.9382C98.7266 85.9382 97.8909 85.102 97.8909 84.0705C97.8909 83.039 98.7266 82.2029 99.7576 82.2029Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M66.9037 65.7674C67.9346 65.7674 68.7704 66.6036 68.7704 67.635C68.7704 68.6665 67.9346 69.5027 66.9037 69.5027C65.8727 69.5027 65.037 68.6665 65.037 67.635C65.037 66.6036 65.8727 65.7674 66.9037 65.7674Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M83.3307 65.7677C84.3616 65.7677 85.1974 66.6039 85.1974 67.6353C85.1974 68.6668 84.3616 69.503 83.3307 69.503C82.2997 69.503 81.464 68.6668 81.464 67.6353C81.464 66.6039 82.2997 65.7677 83.3307 65.7677Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M99.7576 65.7677C100.789 65.7677 101.624 66.6039 101.624 67.6353C101.624 68.6668 100.789 69.503 99.7576 69.503C98.7266 69.503 97.8909 68.6668 97.8909 67.6353C97.8909 66.6039 98.7266 65.7677 99.7576 65.7677Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M66.9037 98.2644C67.9346 98.2644 68.7704 99.1005 68.7704 100.132C68.7704 101.163 67.9346 102 66.9037 102C65.8727 102 65.037 101.163 65.037 100.132C65.037 99.1005 65.8727 98.2644 66.9037 98.2644Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M66.9037 49.3322C67.9346 49.3322 68.7704 50.1684 68.7704 51.1998C68.7704 52.2313 67.9346 53.0675 66.9037 53.0675C65.8727 53.0675 65.037 52.2313 65.037 51.1998C65.037 50.1684 65.8727 49.3322 66.9037 49.3322Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M83.3307 98.2644C84.3616 98.2644 85.1974 99.1005 85.1974 100.132C85.1974 101.163 84.3616 102 83.3307 102C82.2997 102 81.464 101.163 81.464 100.132C81.464 99.1005 82.2997 98.2644 83.3307 98.2644Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M83.3307 49.3322C84.3616 49.3322 85.1974 50.1684 85.1974 51.1998C85.1974 52.2313 84.3616 53.0675 83.3307 53.0675C82.2997 53.0675 81.464 52.2313 81.464 51.1998C81.464 50.1684 82.2997 49.3322 83.3307 49.3322Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M99.7576 98.2644C100.789 98.2644 101.624 99.1005 101.624 100.132C101.624 101.163 100.789 102 99.7576 102C98.7266 102 97.8909 101.163 97.8909 100.132C97.8909 99.1005 98.7266 98.2644 99.7576 98.2644Z"
						fill="white" fill-opacity="0.08"></path>
            <path
						d="M99.7576 49.3322C100.789 49.3322 101.624 50.1684 101.624 51.1998C101.624 52.2313 100.789 53.0675 99.7576 53.0675C98.7266 53.0675 97.8909 52.2313 97.8909 51.1998C97.8909 50.1684 98.7266 49.3322 99.7576 49.3322Z"
						fill="white" fill-opacity="0.08"></path>
          </svg>
			</span>
		</div>
	</footer>
	<!-- ====== Footer Section End -->

	<!-- ====== Back To Top Start -->
	<a href="javascript:void(0)"
		class="back-to-top fixed bottom-8 right-8 left-auto z-[999] hidden h-10 w-10 items-center justify-center rounded-md bg-primary text-white shadow-md transition duration-300 ease-in-out hover:bg-dark">
		<span
		class="mt-[6px] h-3 w-3 rotate-45 border-t border-l border-white"></span>
	</a>
	<!-- ====== Back To Top End -->

	<!-- ====== All Scripts -->
	<script src="assets/js/main.js"></script>
	<script>
    function loadFile(input) {
      var file = input.files[0];	//선택된 파일 가져오기
  
      //미리 만들어 놓은 div에 text(파일 이름) 추가
      var name = document.getElementById('fileName');
      name.textContent = file.name;
  
      //새로운 이미지 div 추가
      var newImage = document.createElement("img");
      newImage.setAttribute("class", 'img');
  
      //이미지 source 가져오기
      newImage.src = URL.createObjectURL(file);   
  
      newImage.style.width = "100%";
      newImage.style.height = "100%";
      newImage.style.visibility = "hidden";   //버튼을 누르기 전까지는 이미지를 숨긴다
      newImage.style.objectFit = "contain";
      newImage.style.marginLeft = "250px";
      
  
      //이미지를 image-show div에 추가
      var container = document.getElementById('image-show');
      container.appendChild(newImage);
    };
    </script>
	<script>
      var submit = document.getElementById('submitButton');
        submit.onclick = showImage;     //Submit 버튼 클릭시 이미지 보여주기

        function showImage() {
          var newImage = document.getElementById('image-show').lastElementChild;
          
          //이미지는 화면에 나타나고
          newImage.style.visibility = "visible";
        
          //이미지 업로드 버튼은 숨겨진다
          document.getElementById('image-upload').style.visibility = 'hidden';

          document.getElementById('fileName').textContent = null;     //기존 파일 이름 지우기
}
    </script>
    
</body>
</html>