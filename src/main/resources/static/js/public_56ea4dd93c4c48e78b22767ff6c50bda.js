function BrowserType() {
    var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串
    var isOpera = userAgent.indexOf("Opera") > -1; //判断是否Opera浏览器
    var isIE = userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1 && !isOpera; //判断是否IE浏览器
    var isEdge = userAgent.indexOf("Windows NT 6.1; Trident/7.0;") > -1 && !isIE; //判断是否IE的Edge浏览器

    if (isIE) {
        var reIE = new RegExp("MSIE (\\d+\\.\\d+);");
        reIE.test(userAgent);
        var fIEVersion = parseFloat(RegExp["$1"]);
        if (fIEVersion < 9) {
            alert("浏览器版本过低，请升级或更换浏览器（谷歌、火狐等）")
            return false;
        } //IE版本过低
    } else {
        // new WOW().init();
    }
    if (isEdge) {
        alert("浏览器版本过低，请升级或更换浏览器（谷歌、火狐等）")
        return false;
    } else {
        // new WOW().init();
    }
}
BrowserType() // 浏览器是否为ie
$(function() {

    $('.pic').click(function() {
        $(this).siblings(".search").slideToggle();

    })
    $(".nav>ul>li").hover(function() {
        $(this).find(".meau-2").stop(false, true).slideDown();
    }, function() {
        $(this).find(".meau-2").stop().slideUp();
    })
    var flag = false;
    $(".search-switch").click(function() {
        $(".t-search").stop().slideToggle();
    })



    $(".menu").click(function() {
        $(".m-nav").animate({
            "left": "0"
        }, 300);
        $(this).hide()
        $(".close-menu").fadeIn();
        $("body").css("overflow", "hidden");
    })
    $(".close-menu").click(function() {
        $(".close-menu").fadeOut()
        $(".m-nav").animate({
            "left": "100%"
        }, 300);
        $(".menu").fadeIn();
        $("body").css("overflow", "auto");
    })
    $(".m-nav>ul>li>span").click(function() {
        $(this).toggleClass("on").parent().siblings("li").find("span").removeClass("on")
        $(this).siblings("ul").slideToggle().parent().siblings("li").find("ul").slideUp()
    })



    $(".nymain .leftNav>ul>li>span").click(function() {
        $(this).parent().stop().toggleClass("on").siblings("li").removeClass("on");
        $(this).siblings("ul").stop().slideToggle(300).parent().siblings().find("ul").stop().slideUp();
    })
})