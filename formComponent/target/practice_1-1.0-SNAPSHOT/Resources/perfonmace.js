function validation(form){
    //get form´s informations.
    var name     = form.userName;
    var lastName = form.userLastName;
    var identification = form.identification;
    var start = form.start;
    var end   = form.end;
    var people= form.people;
    var pet   = form.pet;
    var checkPet = false;
    var comments = form.comments;
    //verifies el value of name.   
    if(name.value.length <= 2){
        name.focus();
        name.select();
        alert("Ingrese un  nombre  valido");
        
        return false;
    }
    //verifies el value of lastname.
    if(lastName.value.length <= 2){
        lastName.focus();
        lastName.select();
        alert("Ingrese un  Apellido  valido");
        
        return false;
    }
    //verifies el value of the identification > 10.
    if(identification.value.length <=9){
        identification.focus();
        identification.select();
        alert("Ingrese una identificación valida.")
        return false;
    }
    //verifies the data of trip start.
    if(start.value.length == 0){
        start.focus();
        start.select();
        alert("Fecha de inicio no valida.")
        return false;
    }
    //verifies the data of end start.
    if(end.value.length == 0){
        start.focus();
        start.select();
        alert("Fecha de salida no valida.")
        return false;
    }
    
    //Verifies if choose a option
    for(var i = 0; i < pet.length; i++){
        if(pet[i].checked){
            checkPet = true;
        }
    }
    
    if(!checkPet){
        alert("Debe indicar si tiene Mascota.");
        return false;
    }
    return true;
}


