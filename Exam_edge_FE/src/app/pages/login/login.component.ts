import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { User } from 'src/app/class/user';
import { LoginService } from 'src/app/service/login.service';

// import { Observable, of, Subject, Subscription, forkJoin } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: User = new User();
  constructor(private snack: MatSnackBar, private loginservice: LoginService,
    private router: Router) {

  }
  ngOnInit(): void { }

  loginUser() {
    // console.log("login function called");

    this.loginservice.validation(this.user).subscribe(res => {
      if (res=='1') {
        this.loginservice.getByName(this.user.username).subscribe(
          (res)=>{
          this.user=res;
          alert("login OK,Admin");
          this.router.navigateByUrl("/adminWelcome/"+this.user.id)  
        });
      }
      else if(res >= '1'){
        this.loginservice.getByName(this.user.username).subscribe(
          (res)=>{
          this.user=res;
          alert("login OK, User");
          this.router.navigateByUrl("/userWelcome/"+this.user.id)
        });
        
      }
      else {
        alert("fail");
      }
    }
    )

  }
}
