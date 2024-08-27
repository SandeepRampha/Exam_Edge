import { HttpClient, HttpRequest,HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseURL from './helper';
import { Observable } from 'rxjs';
import { Quiz } from '../class/quiz';
import { Category } from '../class/category';

@Injectable({
  providedIn: 'root'
})
export class QuizService {

  constructor(private httpClient: HttpClient) { }

  // get all quizzes
  public getAllQuizzes():Observable<any>
  {
    return this.httpClient.get(`${baseURL}/quiz/all`);
  }

  // add new quiz
  public createQuiz(quiz:Quiz)
  {
    return this.httpClient.post(`${baseURL}/quiz/create`,quiz);
  }

  // delete quiz
  public deleteQuiz(quizid:number):Observable<any>
  {
    return this.httpClient.delete(`${baseURL}/quiz/delete/${quizid}`);
  }
  

  // get single quiz
  public getQuiz(quizId:number):Observable<any>
  {
    return this.httpClient.get(`${baseURL}/quiz/quizid/${quizId}`);
  }

  // update quiz
   public updateQuiz(quiz:Quiz,imagefile:File,category:Category)
   {
   return this.httpClient.put(`${baseURL}/quiz/update`,quiz);
 }


 // get quizzes by category
 public getQuizzesByCategory(catid:number):Observable<any>
 {
   return this.httpClient.get(`${baseURL}/quiz/quizzes/${catid}`);
 }


  // get all active quizzes
  public getAllActiveQuizzes():Observable<any>
  {
    return this.httpClient.get(`${baseURL}/quiz/allactive`);
  }



  // get active quizzes by category
  public getActiveQuizzesByCategory(catid:number):Observable<any>
  {
    return this.httpClient.get(`${baseURL}/quiz/quizzesactive/${catid}`);
  }

}
