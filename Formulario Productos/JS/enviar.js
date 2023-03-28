$(document).ready(function() {

    $('#listar').on('click', function() {
        let tabla = document.querySelector('#tabla')
        tabla.innerHTML = '';
        tabla.innerHTML = '<thead><th>Codigo </th><th>Nombre</th><th>Categoria</th><th>Precio</th><th>Cantidad</th><th>Total</th><th>Descuento</th><th>Precio Final</th></thead>';
        $.ajax({
            url: "http://localhost:8080/ListaProductos",
            type: "GET",
            datatype: "JSON",
            success:function(respuesta) {
                console.log(respuesta)
                for (i = 0; i <= respuesta.length; i++) {
                    tabla.innerHTML += '<tr><td>' + respuesta[i].codigo + '</td><td>' +
                        respuesta[i].nombre + '</td><td>' +
                        respuesta[i].categoria + '</td><td>' +
                        respuesta[i].precio + '</td><td>' +
                        respuesta[i].cantidad + '</td><td>' +
                        respuesta[i].total + '</td><td>' +
                        respuesta[i].totalDesc + '</td><td>' +
                        respuesta[i].preciofinal + '</td><td>'
                }

            }

        })

    }); 

    $('#envio').on('click', function () {
        let datos = {
            codigo: $('#codigo').val(),
            nombre: $('#nombre').val(),
            categoria: $('#categoria').val(),
            precio: parseInt($('#precio').val()),
            cantidad: parseInt($('#cantidad').val()),
        }
        console.log(datos);
        let datosEnvio = JSON.stringify(datos);
        console.log(datosEnvio);
        $.ajax({
            url: "http://localhost:8080/InsertarProducto",
            type: "POST",
            data: datosEnvio,
            contentType: "application/JSON",
            datatype: "JSON",
            success: function(respuesta) {
                alert(respuesta);
            }
        });
    });

    $('#calcular1').on('click', function() {
        let datos = {
            codigo: $('#codigo').val(),
            nombre: $('#nombre').val(),
            categoria: $('#categoria').val(),
            precio: parseInt($('#precio').val()),
            cantidad: parseInt($('#cantidad').val())
        }
        console.log(datos);
        let datosEnvio = JSON.stringify(datos);
        console.log(datosEnvio);
        $.ajax({
            url: "http://localhost:8080/TotalProductos",
            type: "GET",
            datatype: "JSON",
            success:function(respuesta) {
                console.log(respuesta)
                for (i = 0; i <= respuesta.length; i++) {
                    tabla.innerHTML += '<tr><td>' + respuesta[i].codigo + '</td><td>' +
                        respuesta[i].nombre + '</td><td>' +
                        respuesta[i].categoria + '</td><td>' +
                        respuesta[i].precio + '</td><td>' +
                        respuesta[i].cantidad + '</td><td>' +
                        respuesta[i].total + '</td><td>' 
                }

            }

        })

    }); 







});

