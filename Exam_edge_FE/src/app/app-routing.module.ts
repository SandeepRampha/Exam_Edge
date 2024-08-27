import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SignupComponent } from './pages/signup/signup.component';
import { LoginComponent } from './pages/login/login.component';
import { HomeComponent } from './pages/home/home.component';
import { DashboardComponent } from './pages/admin/dashboard/dashboard.component';
import { UserdashboardComponent } from './pages/user/userdashboard/userdashboard.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { WelcomeComponent } from './pages/admin/welcome/welcome.component';
import { ViewcategoriesComponent } from './pages/admin/viewcategories/viewcategories.component';
import { AddcategoryComponent } from './pages/admin/addcategory/addcategory.component';
import { ViewquizzesComponent } from './pages/admin/viewquizzes/viewquizzes.component';
import { AddquizComponent } from './pages/admin/addquiz/addquiz.component';
import { UpdatequizComponent } from './pages/admin/updatequiz/updatequiz.component';
import { ViewquizquestionsComponent } from './pages/admin/viewquizquestions/viewquizquestions.component';
import { AddquestionComponent } from './pages/admin/addquestion/addquestion.component';
import { UpdatequestionComponent } from './pages/admin/updatequestion/updatequestion.component';
import { LoadquizComponent } from './pages/user/loadquiz/loadquiz.component';
import { UserwelcomeComponent } from './pages/user/userwelcome/userwelcome.component';
import { UpdatecategoryComponent } from './pages/admin/updatecategory/updatecategory.component';
import { QuizintroComponent } from './pages/user/quizintro/quizintro.component';
import { QuizstartComponent } from './pages/user/quizstart/quizstart.component';
import { LoadresultComponent } from './pages/user/loadresult/loadresult.component';
import { LoadallresultsComponent } from './pages/user/loadallresults/loadallresults.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
    pathMatch: 'full'
  },
  //starting Page
  {
    path: 'signup',
    component: SignupComponent,
    pathMatch: 'full'
  },
  {
    path: 'login',
    component: LoginComponent,
    pathMatch: 'full'
  },
  //Admin
  {
    path: 'adminWelcome',
    component: WelcomeComponent,
  },
  {
    path: 'adminWelcome/:id',
    component: WelcomeComponent,
  },
  // {
  //   path: 'dashboard/:id',
  //   component: DashboardComponent,
  // },
  {
    path: 'viewquizzes',
    component: ViewquizzesComponent,
  },
  {
    path: 'viewquizzes/:catid',
    component: ViewquizzesComponent,
  },
  {
    path: 'addquiz',
    component: AddquizComponent,
  },
  {
    path: 'viewcategories',
    component: ViewcategoriesComponent,
  },
  {
    path: 'addcategory',
    component: AddcategoryComponent,
  },
  {
    path:'updatecategory/:catid',
    component:UpdatecategoryComponent,
  },
  {
    path: 'updatequiz/:quizid',
    component: UpdatequizComponent,
  },
  {
    path: 'viewquizquestions/:quizid',
    component:ViewquizquestionsComponent
  },
  {
    path: 'addquestion/:quizid',
    component: AddquestionComponent,
  },
  {
    path: 'updatequestion/:quesid',
    component: UpdatequestionComponent,
  },

  //User
  {
    path: 'userDashboard',
    component: UserdashboardComponent,
  },
  {
    path: 'userDashboard/:id',
    component: UserdashboardComponent,
  },
  //Display's User profile
  {
    path: 'loadquiz/:catid',
    component: LoadquizComponent,
  },
  {
    path: 'loadquiz',
    component: LoadquizComponent,
  },
  {
    path: 'userWelcome',
    component: UserwelcomeComponent,
  },
  {
    path: 'userWelcome/:id',
    component: UserwelcomeComponent,
  },
  {
    path: 'userdashboard/profile',
    component: ProfileComponent,
  },
  {
    path:'quizstart/:quizid',
    component:QuizstartComponent,
  },
  {
    path: 'quizintro/:quizid',
    component: QuizintroComponent,
  },
  {
    path: 'userdashboard/loadresult',
    component: LoadresultComponent,
  },
  {
    path: 'userdashboard/loadallresults',
    component: LoadallresultsComponent,
  },
  
  
  //            Common           //
  {
    path: 'profile/:id',
    component: ProfileComponent,
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
