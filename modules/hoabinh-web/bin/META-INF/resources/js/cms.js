function expandingWindow(website) {
	var heightspeed = 2; // vertical scrolling speed (higher = slower)
	var widthspeed = 7; // horizontal scrolling speed (higher = slower)
	var leftdist = 0; // distance to left edge of window
	var topdist = 0; // distance to top edge of window
	var winwidth = window.screen.availWidth - leftdist;
	var winheight = window.screen.availHeight - topdist;
	var sizer = window.open(website, "", "left=" + leftdist + ",top=" + topdist
			+ ",width=1,height=1,scrollbars=yes");
	for (sizeheight = 1; sizeheight < winheight; sizeheight += heightspeed) {
		sizer.resizeTo("1", sizeheight);
	}
	for (sizewidth = 1; sizewidth < winwidth; sizewidth += widthspeed) {
		sizer.resizeTo(sizewidth, sizeheight);
	}
	sizer.location = website;
}

function shareFacebook() {
	var curentURL = window.location.href;
	window.open("http://www.facebook.com/sharer.php?u="+curentURL+"&t="+curentURL, 'Facebook share Page', 'width=900,height=500,resizable=yes');
}
function shareTwitter() {
	window.open("http://twitter.com/share?url=" + window.location.href, 'Twitter share Page', 'width=900,height=300,resizable=yes');
	//$(".twitter_button").attr("href","http://twitter.com/share?url=" + window.location.href);
}
function shareLinkedIn() {
	var currentURL = window.location.href;
	window.open("http://www.linkedin.com/shareArticle?mini=true&url=" + currentURL + "&title="+ currentURL + "&summary="+currentURL+"&source="+currentURL, 'LinkedIn share Page', 'width=900,height=500,resizable=yes');
	//$(".linkedin_button").attr("href","http://www.linkedin.com/shareArticle?mini=true&url=" + currentURL + "&title="+ currentURL + "&summary="+currentURL+"&source="+currentURL);
}
function shareGooglePlus() {
	window.open("https://plus.google.com/share?url=" + window.location.href, 'Google+ share Page', 'width=900,height=500,resizable=yes');
	//$(".googlePlus_button").attr("href","https://plus.google.com/share?url=" + window.location.href);
}
function sendEmail() {
	var title = $("#titleDetail").html();
	var summary = $("#leadDetail").html();
	var currentURL = window.location.href;
	var newline = escape("\n");
	var body = summary + newline + currentURL;

	window.location="mailto:?subject=" + title + "&body=" + body;
}