

$.ajax({
	url: "OrderPage.do",
	success: function(data) {

		console.log(key);
		let output = "";
			output += `
            	<div class="bundleTitle">제품이름${key.title}</div>
              	<div class="bundleShipping">무료배송${key.shipping}</div>
	        `;

		$(".bundleItemList").html(output);
	}
});