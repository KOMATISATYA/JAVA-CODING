
function validate()
{
  var n1=document.myform.fname.value;
  var n2=document.myform.uname.value;
  if((n1==null||n1=="")&&(n2==null||n2==""))
{
 alert("name can't be blank");
 return false;
}

var x=document.myform.ename.value;
var atposition=x.indexOf("@");
var dotposition=x.lastIndexOf(".");
if(atposition<1||dotposition<atposition+2||dotposition+2>=x.length)
{
 alert("plz..enter valid email address");
 return false;
}



var pno=document.getElementById("contact").value;
if(pno.length==0)
{
  alert("plz enter phone number");
  return false;
}
if((pno.length<10)&&(pno.length>10))
{
  if(isNaN(pno))
{
  alert("not a number...plz enter valid number");
 return false;
}
else
{
  alert("not a mobile number");
return false;
}
}
if(isNaN(pno))
{
 alert("plz enter valid ph number");
 return false;
}

var psd=document.myform.pass.value;
if(psd.length<6)
{
 alert("password must be atleast 6 characters long");
 return false;
}
var repsd=document.myform.pass1.value;
if(psd!=repsd)
{
  alert("password must be same");
  return false;
}
return true;
}
