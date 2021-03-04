function showFileName(idx) {
	var input = document.getElementById('attachment'+idx+'');
	var output = '';
	for (var i = 0; i < input.files.length; i++) {
		output += '<li class="addNewFile"><a href="javascript:void(0)">' + input.files.item(i).name + '</a><input type="hidden" name="inputFileName" value="'+input.files.item(i).name+'"></li>';
	}
	$("#fileNamesUL"+idx+"").append(output);
}

function showImageName() {
	var input = document.getElementById('image');
	var output = '';
	for (var i = 0; i < input.files.length; i++) {
		output += '<li class="addNewFile"><a href="javascript:void(0)">' + input.files.item(i).name + '</a><input type="hidden" name="imageName" value="'+input.files.item(i).name+'"></li>';
	}
	$("#imageNameUL").append(output);
}

function addNewRow(tableID){
	var table = document.getElementById(tableID);
	var rowCount = table.rows.length;
	var oldSuffix = parseInt(table.rows[(rowCount - 1)].getAttribute('suffix'));
	var newSuffix = oldSuffix + 1;
	var sttcol = "<td>"+rowCount+"</td>";
	var fileCol = '<td><input type="file" id="attachment'+newSuffix+'" name="attachment" multiple="multiple" onchange="showFileName('+newSuffix+')" /></td>';
	var fileNameCol = '<td><ul id="fileNamesUL'+newSuffix+'"></ul></td>';
	var actionCol = '<td></td>';	
	$('#' + tableID + ' tr:last').after("<tr suffix='"+newSuffix+"'>"
			   + sttcol
			   + fileCol
			   + fileNameCol
			   + actionCol
        + "</tr>");
}

function printDiv(divName) {
    var printContents = document.getElementById(divName).innerHTML;
    var originalContents = document.body.innerHTML;
    document.body.innerHTML = printContents;
    window.print();
    document.body.innerHTML = originalContents;
}

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
	var title = $("#contentDetailTitleId").html();
	var summary = $("#sapoDetailId").html();
	var currentURL = window.location.href;
	var newline = escape("\n");
	var body = summary + newline + currentURL;

	window.location="mailto:?subject=" + title + "&body=" + body;
}