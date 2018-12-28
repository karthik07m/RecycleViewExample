import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {
  userid:string;
  constructor(private router: Router) { }

  ngOnInit() {
    this.userid=localStorage.getItem("userId");
  }
  Dashboard() {
    this.router.navigate(["dashboard"]);
    }
  empHome(logform){
    var usId = localStorage.getItem("userId");
    var pswd = logform.value.password;
    if(usId=="1000" && pswd=="1000") {
     console.log(usId +"you have sucessfully logged in");
     this.router.navigate(["dashboard"]);
    }
    else if(usId=="2000" && pswd=="2000") {
      console.log(usId + "you have sucessfully logged in");
      this.router.navigate(["dashboard"]);
    }
    else if(usId=="2001" && pswd=="2001") {
      console.log(usId + "you have sucessfully logged in");
      this.router.navigate(["dashboard"]);
    }
    else if(usId=="3000" && pswd=="3000") {
      console.log(usId+ "you have sucessfully logged in");
      this.router.navigate(["dashboard"]);
    }
    else if(usId=="30001" && pswd=="3001") {
      console.log(usId+ "you have sucessfully logged in");
      this.router.navigate(["dashboard"]);
  }
  else {
    alert("invalid password");
    console.log("invalid username or password");
  }
}
  
}
