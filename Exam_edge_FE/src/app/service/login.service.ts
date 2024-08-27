import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../class/user';
import baseURL from './helper';
import { BehaviorSubject, Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructorr() { }


  // private loggedIn = new BehaviorSubject<boolean>(false);
  // private currentUser = new BehaviorSubject<User | null>(null);


  constructor(private httpClient: HttpClient) { }

  // get loginStatus(): Observable<boolean> {
  //   return this.loggedIn.asObservable();
  // }

  // get user(): Observable<User | null> {
  //   return this.currentUser.asObservable();
  // }

  validation(user:User):Observable<any>
  {
    return this.httpClient.post(`${baseURL}/user/login`,user);
  }

  getByName(username: any): Observable<User> {
    return this.httpClient.get<User>(`${baseURL}/user/username/${username}`);
  }

  getAllUser():Observable<any>{
    return this.httpClient.get(`${baseURL}/user/all`);
  }

  getById(id:any):Observable<User>{
    return this.httpClient.get<User>(`${baseURL}/user/userid/${id}`);
  }

  getRole(id:any):Observable<User>{
    return this.httpClient.get<User>(`${baseURL}/user/roles/${id}`);
  }

  // login(user: User) {
  //   this.loggedIn.next(true);
  //   this.currentUser.next(user);
  // }

  // logout() {
  //   this.loggedIn.next(false);
  //   this.currentUser.next(null);
  // }
}
