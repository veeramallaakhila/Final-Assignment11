function validate(){
let x1=documentgetElementById("Survey Name");
if(x1.value==""){
documentgetElementById("p1").innerHTML="Survey name should not be empty"
return false;
}
let x2=documentgetElementById("survey Type");
if(x2.value==""){
documentgetElementById("p2").innerHTML="Survey type should not be empty"
return false
}
let x3=documentgetElementById("Start Date");
if(x3.value==""){
documentgetElementById("p3").innerHTML="Start Date should not be empty"
return false

}
let x4=documentgetElementById("End Date");
if (x4.value==""){
documentgetElementById("p4").innerHTML="End date should not be empty"
return false
}
let x5=documentgetElementById("Preview")
if (x5.value==""){
documentgetElementById("p5").innerHTML="Preview your survey"
return false
}

let x6=documentgetElementById("Publish")
if (x6.value==""){
documentgetElementById("p6").innerHTML="Publish your Survey"
return false
}
}