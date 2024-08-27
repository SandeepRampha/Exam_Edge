import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from 'src/app/class/user';
import { LoginService } from 'src/app/service/login.service';
import { __param } from 'tslib';

@Component({
  selector: 'sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent {

  // user: User = new User();
  id:any;
  quizid:any;
  constructor(private activatedRoute: ActivatedRoute) { }

  Profile() {
    //Profile userid
    this.activatedRoute.paramMap.subscribe(param => {
    this.id=param.get('id');
    });

    //quiz quizid
    this.activatedRoute.paramMap.subscribe(param => {
    this.quizid=param.get('quizid');
    });
  }

  logoutUser() {
    window.location.reload();
  }
}
