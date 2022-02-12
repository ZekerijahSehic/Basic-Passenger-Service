$('document').ready(function() {

    $('table #editButton').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function (passenger) {
            $('#idEdit').val(passenger.id);
            $('#firstnameEdit').val(passenger.firstname);
            $('#lastnameEdit').val(passenger.lastname);
            $('#emailEdit').val(passenger.email);
            $('#passportidEdit').val(passenger.passportid);
        });
        $('#editPassenger').modal();
    })

    $('table #detailsButton').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $.get(href, function (passenger) {
            $('#idDetails').val(passenger.id);
            $('#firstnameDetails').val(passenger.firstname);
            $('#lastnameDetails').val(passenger.lastname);
            $('#emailDetails').val(passenger.email);
            $('#passportidDetails').val(passenger.passportid);
        });
        $('#detailsPassenger').modal();
    })

    $('table #deleteButton').on('click', function (event) {
        event.preventDefault();
        var href=$(this).attr('href')
        $('#confirmDeleteButton').attr('href', href)
        $('#deletePassenger').modal()
    })



})