
//Assignment-1
function calculate() {
	 var today = new Date();
	var d=today.getFullYear();
	var age = document.getElementById('age').value;
	var age1=d-age;
	document.write("You are born in  " + age1);
}
//Assignment-2
function greet() {
	var name = document.getElementById('name').value;
	document.write("Hello  " + name +"!!");
}
//Assignment-3
function division() {
	var num1=document.getElementById('n1').value;
	var num2=document.getElementById('n2').value;
	if(num2==0)
		{
		alert("Please Enter a valid Number");
		}
	var n=num1/num2;
	document.write("Answer:-  " +n);
}
//Assignment-4
function getMultiplication()
{
           var no = document.getElementById("number").value;
           for ( i=1; i<=10; i++) 
           {
           	document.write("<p>"+no+" x " +i+" = "+no*i+"</p>");
           }
           var con=confirm("Want to continue With next no");
           if (con==true)
           {
              window.parent;
           }
           else
           {
              window.close();
           }
}
//Assignment-5
function isVowel() {
	var input=document.getElementById('c').value;
	if (input == 'a' || input == 'A' || input == 'e' || input == 'E' || input == 'i'
		|| input == 'I' || input == 'o' || input == 'O' || input == 'u' || input == 'U') {
		document.write("Its a vowel");
		} else if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
		  document.write("Its a consonant");
		} else {
		    document.write("Invalid input please enter an alphabet");
		 }
}
//Assignment-6
function prime() {
	var low=document.getElementById('a').value;
	var high=document.getElementById('b').value;
	var i;
	var j;
	var flag;
	 while (low < high) {
          flag = 0;
         for(i = 2; i <= low/2; ++i) {
             // condition for nonprime number
             if(low % i == 0) {
                 flag = 1;
                 break;
             }
         }
         if (flag==0)
             console.log(low + " ");

         ++low;
     }
}
//Assignment-7
function Fact(){
	var x=document.getElementById('x').value;
	var n=1;
	while(x!=0)
		{
		n=x*n;
		x--;
		}
	document.write("Factorial:" +n);
}

//Assignment-8
function login()
{
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;
        console.log()

        if(username==password)
        {
            alert("User Logged in");
            window.flag=0;

        }
        else
        {
            
            if (window.flag<3) 
            {
               alert("Invalid Username or  password") ;
            }
            else
            {
                 document.write("<h2>Login Attempt Exceeded<h2>")   
            }
            window.flag++;
            
        }
    
}

//Assignment-9
function arrayTest()
{
    var arr=[3,13,25,2,43,7,8];
    var prop = document.getElementById("array").value;
    switch(prop)
    {
        case "max":
          var max=arr[0];
          for (var i = 0; i < arr.length; i++) 
          {
                if(arr[i]>max)
                    max=arr[i];
          }
            alert("Maximum value in the array is "+max);  
             break;
        case "min":
            var min=arr[0];
          for (var i = 0; i < arr.length; i++) 
          {
                if(arr[i]<min)
                    min=arr[i];
          }
            alert("Minimum value in the array is "+min);
            break;
        case "total":
            var total=0;
          for (var i = 0; i < arr.length; i++) 
          {
                total+=arr[i];
          }
            alert("Total value of arr "+total);
            break;
        case "average":
             var total=0;
          for (var i = 0; i < arr.length; i++) 
          {
                total+=arr[i];
          }
            alert("Average of arr "+total/arr.length);
            break;
        default:
            alert("Invalid Choice");

    
    }

}
//Assignment-10
function arraySort()
{
    var arr=[3,13,25,2,43,7,8];
    var prop = document.getElementById("sort").value;
    switch(prop)
    {
        case "ascending":   
            alert("Array in ascending order "+arr.sort(function(a,b){return a-b})); 
        /*here we declared a compareFunction which Takes in two Arguments and is the difference is negative 
        (i.e. the compareFunction returns -ve) that mean the first no is Smaller than the latter and this mechanism
        is repeated for each element*/    
            break;
        case "descending": 
            alert("Array in descending order "+arr.sort(function(a,b){return b-a}));
            break;
        default:
            alert("Invalid Choice");
    }
}
//Assignmet-11
function checkVowels()
{
    var str=document.getElementById("string").value;
    var arr=[0,0,0,0,0]
    for (var i = 0; i < str.length; i++)
    {
        if (str.charAt(i)=="a"||str.charAt(i)=="A")
        arr[0]++;
        if (str.charAt(i)=="e"||str.charAt(i)=="E")
        arr[1]++;
        if (str.charAt(i)=="i"||str.charAt(i)=="I")
        arr[2]++;
        if (str.charAt(i)=="o"||str.charAt(i)=="O")
        arr[3]++;
        if (str.charAt(i)=="u"||str.charAt(i)=="U")
        arr[4]++;
            
    }
    document.write("<p> a = " +arr[0]+"</p>");
    document.write("<p> e = " +arr[1]+"</p>");
    document.write("<p> i = " +arr[2]+"</p>");
    document.write("<p> o = " +arr[3]+"</p>");
    document.write("<p> u = " +arr[4]+"</p>");

}

//Assignment-12
function checkPalindrome()
{
    var str=document.getElementById("palindrome").value;
    var reverseStr= new String();
    for (var i = str.length-1; i >=0; i--) 
    {
        reverseStr+=str.charAt(i);
    }
    if(str==reverseStr)
    {
        alert("Is palindrome");
    }
    else
    {
        alert("not palindrome");
    }
}
//Assignment-13
function validateemail()  
{  
var x= document.getElementById("email").value;
var atposition=x.indexOf("@");  
var dotposition=x.lastIndexOf(".");  
    if (atposition<1 || dotposition-atposition<2 || dotposition+2>=x.length)
    {  
        alert("Please enter a valid e-mail address \n atpostion:"+atposition+"\n dotposition:"+dotposition);  
    }
    else
    {
        alert("Welcome Email Verified")
    }
}

function validateEmail()
{
    var email= document.getElementById("email").value;
    var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;

        if (reg.test(email) == false) 
        {
            alert('Invalid Email Address');
        }

        else
        {
            alert("Valid email")
        }
}
//Assignment-14
function countCharacters()
{
    var count=0;
    var str=document.getElementById("sentence").value;
    for (var i = 0; i < str.length; i++)
    {
        if(str.charAt(i)!=" ")
            count++;
    }
    alert("No oF characters "+count);
}
//Assignment-15
 function removeWhitespace()
 {
    var str=document.getElementById("sentence").value;

    alert("The Req string="+str.trim());
 }
 //Assignment-16
 function order(id,name,price)
 {
    this.id=id;
    this.name=name;
    this.price=price;
    this.getPrice=function()
    {
        return this.price;
    }
}

function getTotalOrderPrice()
    {
        var orderArr=new Array(); 
        
        orderArr[0]=new order(1,"Choclate",50);
        orderArr[1]=new order(2,"Football",5000);
        orderArr[2]=new order(3,"T-shirt",200);
        orderArr[3]=new order(4,"Lappy",70000);
        orderArr[4]=new order(5,"X-box",6000);
        
        var totalPrice=0;
        for (var i = 0; i < orderArr.length; i++) 
        {
            totalPrice+=orderArr[i].getPrice();
        }
        alert("The total price of all Orders is "+totalPrice);
    }



