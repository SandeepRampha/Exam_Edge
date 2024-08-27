import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/class/user';
import { LoginService } from 'src/app/service/login.service';

@Component({
  selector: 'navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent  {

  public loggedIn = false;

  user: User = new User();

  constructor(public loginService:LoginService) {  }

  // ngOnInit() {
  //   this.loginService.loginStatus.subscribe(loggedIn => {
  //     this.loggedIn = loggedIn;
  //   });

  //   this.loginService.user.subscribe((user:any) => {
  //     this.user = user;
  //   });
  // }

  // logoutUser() {
  //   this.loginService.logout();
  //   window.location.reload();
  // }

}
