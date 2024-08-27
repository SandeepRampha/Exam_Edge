import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { role } from 'src/app/class/role';
import { User } from 'src/app/class/user';
import { LoginService } from 'src/app/service/login.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent {

  user: User= new User();
  role: role = new role();
  userlist:User[]=[];
  id:any;
  roleName:any;
  constructor(private activatedRoute: ActivatedRoute,
    private loginService: LoginService) { }
    
    ngOnInit(): void {
      this.activatedRoute.paramMap.subscribe(params => {
       this.id=params.get('id');
      });
      this.loginService.getById(this.id).subscribe(
        (res)=>{
          this.user=res;
        }
      );
    }
  
    

}
