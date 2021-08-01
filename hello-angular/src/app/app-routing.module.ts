import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllPetsComponent } from './components/all-pets/all-pets.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { SinglePetComponent } from './components/single-pet/single-pet.component';
import { CartComponent } from './components/cart/cart.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
  },
  {
    path: 'login',
    component: LoginComponent,
    children: [
      {
        path: 'login/',
        component: LoginComponent,
      },
    ],
  },
  {
    path: 'navbar',
    component: NavbarComponent,
  },
  {
    path: 'home',
    component: HomeComponent,
  },
  {
    path: 'allpets',
    component: AllPetsComponent,
  },

  {
    path: 'singlepet',
    component: SinglePetComponent,
  },
  {
    path: 'cart',
    component: CartComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
