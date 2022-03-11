// para cambiara cantidad de producto
const mas = document.querySelectorAll('.mas');

mas.forEach(boton => {
    boton.addEventListener('click', (e) => {
        e.preventDefault();
        const input = e.target.previousElementSibling;
        input.setAttribute('value', (input.value++))
    })
});


$(document).ready(function(){
    $.ajax('home.json', {
        dataType: 'json',
        contentType: 'application/json',
        cache: false
    })
    .done(function(response){
        var html;

        $.each(response, function(index, element){

            html = '<div class="form-floating">';
            html += '<textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea2" style="height: 100px">';
            html += ''+element.texto+'';
            html += '</textarea>';
            html += '<label for="floatingTextarea2">'+element.pagina+'</label>';
            html += '</div>';

            $('.requestajax').append(html);
        })
    })
})

