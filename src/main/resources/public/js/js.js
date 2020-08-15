(function(){	

	var current = 0;
	var time = 6;
	var direction = 0;

	var prev = 0;
	var carouselPic = document.getElementsByClassName('carousel-pic');
	var presentation = document.getElementById('cars');
	var interval = null;


	function setVisible(){
		carouselPic[current].classList.add('visible');
	}

	function removeVisible(){
		carouselPic[prev].classList.remove('visible');
	}

	function next(){ prev = current; if(++current == carouselPic.length)
current=0; setVisible(); removeVisible(); } (function(){

	var current = 0;
	var time = 6;
	var direction = 0;

	var prev = 0;
	var carouselPic = document.getElementsByClassName('carousel-pic');
	var presentation = document.getElementById('cars');
	var interval = null;


	function setVisible(){
		carouselPic[current].classList.add('visible');
	}

	function removeVisible(){
		carouselPic[prev].classList.remove('visible');
	}

	function next(){
		prev = current;
		if(++current == carouselPic.length) current=0;
		setVisible();
		removeVisible();
	}

	function previous(){
		prev = current;
		if(--current == -1) current = carouselPic.length - 1;
		setVisible();
		removeVisible();
	}

	function changePicture(){
		if(direction) next();
		else previous();
	}

	function startPresentation(){
		interval =  setInterval(function(){
			changePicture();
		}, time * 1000);
	}

	function stopPresentation(){
		clearInterval(interval);
	}


	presentation.onclick = function(){
		stopPresentation();
		changePicture();
		startPresentation();
	}

	setVisible();
	startPresentation();


})();

var json1 =
[{"id":1,"mark":"AUDI","model":"A6","productionDateStart":"2000-01-01","productionDateEnd":"2020-01-30"},
{"id":2,"mark":"AUDI","model":"A3","productionDateStart":"2001-01-02","productionDateEnd":"2019-12-30"},
{"id":3,"mark":"AUDI","model":"A4","productionDateStart":"2002-03-01","productionDateEnd":"2019-11-30"},
{"id":4,"mark":"AUDI","model":"A1","productionDateStart":"2003-04-01","productionDateEnd":"2019-10-30"},
{"id":5,"mark":"AUDI","model":"A7","productionDateStart":"2004-05-01","productionDateEnd":"2019-09-30"},
{"id":6,"mark":"AUDI","model":"Q7","productionDateStart":"2005-06-01","productionDateEnd":"2019-08-30"},
{"id":7,"mark":"BMW","model":"E60","productionDateStart":"2000-01-01","productionDateEnd":"2020-01-30"},
{"id":8,"mark":"BMW","model":"E61","productionDateStart":"2001-02-01","productionDateEnd":"2019-01-30"},
{"id":9,"mark":"BMW","model":"E39","productionDateStart":"2002-03-01","productionDateEnd":"2019-01-30"},
{"id":10,"mark":"BMW","model":"E34","productionDateStart":"2003-04-01","productionDateEnd":"2019-01-30"},
{"id":11,"mark":"BMW","model":"E28","productionDateStart":"2004-05-01","productionDateEnd":"2019-01-30"},
{"id":12,"mark":"BMW","model":"E17","productionDateStart":"2005-06-01","productionDateEnd":"2019-01-30"},
{"id":13,"mark":"BMW","model":"F06","productionDateStart":"2006-07-01","productionDateEnd":"2020-03-30"},
{"id":14,"mark":"LEXUS","model":"ES IV","productionDateStart":"2006-07-01","productionDateEnd":"2020-03-30"},
{"id":15,"mark":"LEXUS","model":"ES III","productionDateStart":"2006-08-01","productionDateEnd":"2020-01-30"},
{"id":16,"mark":"LEXUS","model":"GS III","productionDateStart":"2006-09-01","productionDateEnd":"2020-03-30"},
{"id":17,"mark":"LEXUS","model":"IS III","productionDateStart":"2006-10-01","productionDateEnd":"2020-04-30"},
{"id":18,"mark":"TOYOTA","model":"COROLLA","productionDateStart":"2000-07-01","productionDateEnd":"2020-03-30"},
{"id":19,"mark":"TOYOTA","model":"CAMRY","productionDateStart":"2006-07-01","productionDateEnd":"2020-03-30"},
{"id":20,"mark":"MAZDA","model":"3","productionDateStart":"2013-07-01","productionDateEnd":"2020-03-30"}];

var json2 = 
[{"componentName":"CHLODNICA","descriptionComponent":"KOMPLETNA CHŁODNICA","componentPrice":500.0,"idWarehiouse":1,"idCar":1},
{"componentName":"CHLODNICA","descriptionComponent":"KOMPLETNA CHŁODNICA","componentPrice":600.0,"idWarehiouse":2,"idCar":2},
{"componentName":"CHLODNICA","descriptionComponent":"KOMPLETNA CHŁODNICA","componentPrice":700.0,"idWarehiouse":3,"idCar":3},
{"componentName":"CHLODNICA","descriptionComponent":"KOMPLETNA CHŁODNICA","componentPrice":800.0,"idWarehiouse":4,"idCar":4},
{"componentName":"CHLODNICA","descriptionComponent":"KOMPLETNA CHŁODNICA","componentPrice":900.0,"idWarehiouse":5,"idCar":5},
{"componentName":"CHLODNICA","descriptionComponent":"KOMPLETNA CHŁODNICA","componentPrice":500.0,"idWarehiouse":6,"idCar":6},
{"componentName":"CHLODNICA","descriptionComponent":"KOMPLETNA CHŁODNICA","componentPrice":600.0,"idWarehiouse":7,"idCar":7},
{"componentName":"CHLODNICA","descriptionComponent":"KOMPLETNA CHŁODNICA","componentPrice":700.0,"idWarehiouse":8,"idCar":8},
{"componentName":"CHLODNICA","descriptionComponent":"KOMPLETNA CHŁODNICA","componentPrice":800.0,"idWarehiouse":9,"idCar":9},
{"componentName":"CHLODNICA","descriptionComponent":"KOMPLETNA CHŁODNICA","componentPrice":800.0,"idWarehiouse":10,"idCar":20},
{"componentName":"FILTR PALIWA","descriptionComponent":"ORYGINALNY FILTR PALIWA","componentPrice":500.0,"idWarehiouse":11,"idCar":20},
{"componentName":"FILTR PALIWA","descriptionComponent":"ORYGINALNY FILTR PALIWA","componentPrice":600.0,"idWarehiouse":12,"idCar":11},
{"componentName":"FILTR PALIWA","descriptionComponent":"ORYGINALNY FILTR PALIWA","componentPrice":700.0,"idWarehiouse":13,"idCar":8},
{"componentName":"FILTR PALIWA","descriptionComponent":"ORYGINALNY FILTR PALIWA","componentPrice":800.0,"idWarehiouse":14,"idCar":11},
{"componentName":"FILTR PALIWA","descriptionComponent":"ORYGINALNY FILTR PALIWA","componentPrice":900.0,"idWarehiouse":15,"idCar":12},
{"componentName":"FILTR PALIWA","descriptionComponent":"ORYGINALNY FILTR PALIWA","componentPrice":500.0,"idWarehiouse":16,"idCar":13},
{"componentName":"FILTR PALIWA","descriptionComponent":"ORYGINALNY FILTR PALIWA","componentPrice":400.0,"idWarehiouse":17,"idCar":14},
{"componentName":"FILTR PALIWA","descriptionComponent":"ORYGINALNY FILTR PALIWA","componentPrice":6500.0,"idWarehiouse":18,"idCar":15},
{"componentName":"FILTR PALIWA","descriptionComponent":"ORYGINALNY FILTR PALIWA","componentPrice":5400.0,"idWarehiouse":19,"idCar":16},
{"componentName":"FILTR PALIWA","descriptionComponent":"ORYGINALNY FILTR PALIWA","componentPrice":5400.0,"idWarehiouse":20,"idCar":17},
{"componentName":"FILTR PALIWA","descriptionComponent":"ORYGINALNY FILTR PALIWA","componentPrice":5000.0,"idWarehiouse":21,"idCar":18},
{"componentName":"FILTR PALIWA","descriptionComponent":"ORYGINALNY FILTR PALIWA","componentPrice":5070.0,"idWarehiouse":22,"idCar":19}]


var json3 = 
[{"id":1,"productFeature":"WZMOCNIONA","idComponent":1},
{"id":2,"productFeature":"POLECANA PRZEZ ZAKLADY NAPRAWCZE","idComponent":1},
{"id":3,"productFeature":"WZMOCNIONA","idComponent":2},
{"id":4,"productFeature":"POLECANA PRZEZ ZAKLADY NAPRAWCZE","idComponent":2}]


var json4 = 
[{"id":1,"actionName":"WYMIANA CHLODNICY","actionStartDate":"2020-07-01","actionEndDate":"2020-11-30","idComponent":1},
{"id":2,"actionName":"WYMIANA FILTRA PALIWA","actionStartDate":"2020-08-01","actionEndDate":"2020-11-30","idComponent":2}]


var json5 = 
[{"componentAvailability":true,"shippingTime":10},
{"componentAvailability":true,"shippingTime":11},
{"componentAvailability":true,"shippingTime":1},
{"componentAvailability":true,"shippingTime":1},
{"componentAvailability":true,"shippingTime":1},
{"componentAvailability":true,"shippingTime":1},
{"componentAvailability":true,"shippingTime":10},
{"componentAvailability":true,"shippingTime":1},
{"componentAvailability":true,"shippingTime":10},
{"componentAvailability":true,"shippingTime":10},
{"componentAvailability":true,"shippingTime":12},
{"componentAvailability":true,"shippingTime":11},
{"componentAvailability":true,"shippingTime":1},
{"componentAvailability":true,"shippingTime":1},
{"componentAvailability":true,"shippingTime":2},
{"componentAvailability":true,"shippingTime":13},
{"componentAvailability":true,"shippingTime":11},
{"componentAvailability":true,"shippingTime":10},
{"componentAvailability":true,"shippingTime":12},
{"componentAvailability":true,"shippingTime":12}]





function getHeaderArray(category){

	if(category=='Car'){

		return ['id', 'mark', 'model', 'productionDateStart', 'productionDateEnd'];

	}else if(category=='Component'){

		return ['id', 'componentName', 'descriptionComponent', 'componentPrice'];

	}else if(category=='ProductFeature'){

		return ['id', 'productFeature'];

	}else if(category=='ServiceAction'){

		return ['id', 'actionName', 'actionStartDate', 'actionEndDate'];
	}

	return ['id', 'componentAvailability', 'shippingTime'];

}




function drawTableContainer(categoryArr){

	var container = document.getElementById('table-interactive-container');

	container.innerHTML = "";

	var table = document.createElement('table');
	var tr = document.createElement('tr');

	table.appendChild(tr);
	table.setAttribute('id', 'table-content');
	container.appendChild(table);

	for(i=0; i<categoryArr.length; i++){

		var th = document.createElement('th');
		tr.appendChild(th);

		var text = document.createTextNode(categoryArr[i]);
		th.appendChild(text);
	}
}


function getCarTable(arr, n){

	var table = document.getElementById('table-content');

	for(i=0; i<arr.length; i++){

		var tr = document.createElement('tr');

		var m=0;
		for (val in arr[i]){

			var td = document.createElement('td');
			var text = document.createTextNode(arr[i][val]);

			td.appendChild(text);
			tr.appendChild(td);

			m++;

			if(m==n){
				break;
			}
		}

		table.appendChild(tr);
	}
}


function drawThematicTable(type, jsonData, e){


	e.preventDefault();
	var headerArr = getHeaderArray(type);
	drawTableContainer(headerArr);
	getCarTable(jsonData, headerArr.length);
}

document.getElementById('Car').onclick = function(e){drawThematicTable('Car', json1, e)};
document.getElementById('Component').onclick = function(e){drawThematicTable('Component', json2, e)};
document.getElementById('ProductFeature').onclick = function(e){drawThematicTable('ProductFeature', json3, e)};
document.getElementById('ServiceAction').onclick = function(e){drawThematicTable('ServiceAction', json4, e)};
document.getElementById('Warehouse ').onclick = function(e){drawThematicTable('Warehouse ', json5, e)};

})();