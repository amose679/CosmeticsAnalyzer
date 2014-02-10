var light_grey = '#DBD4CC';

$(document).ready(function() {
	
	$('#pc_button').click(function(){
		update_ing('#pc', '#ir', '#veg', '#byo');
	});
	$('#ir_button').click(function(){
		update_ing('#ir', '#pc', '#veg', '#byo');
	});

	$('#veg_button').click(function(){
		update_ing('#veg', '#ir', '#pc', '#byo');
	});

	$('#byo_button').click(function(){
		update_ing('#byo', '#ir', '#veg', '#pc');
	});
	$('.selector').click(function(){
		$('#prod_cont').show();
	});	
	$("#prod_form").submit(function( event ){
		event.preventDefault();
		ingredient_analyzer();
	});

});

function update_ing(show, hide1, hide2, hide3){
	$(show+'_ing').show();
	$(show+'_button').css('background-color', light_grey);
	$(hide1+'_ing').hide();
	$(hide1+'_button').css('background-color', 'transparent');
	$(hide2+'_ing').hide();
	$(hide2+'_button').css('background-color', 'transparent');
	$(hide3+'_ing').hide();
	$(hide3+'_button').css('background-color', 'transparent');
}

function ingredient_analyzer(){
	var prod_ing = $('#prod_ing').val();
	$('#results_cont').show();
	var li = document.createElement('li');
	$("#results_ul").append('<li>'+prod_ing+'</li>');

}