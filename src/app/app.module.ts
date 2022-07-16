import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { Route,RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddClientComponent } from './client-module/add-client/add-client.component';
import { ClientAttachmentComponent } from './client-module/client-attachment/client-attachment.component';

export const routes: Route[] = [
  {
    path: 'addClient',
    component: AddClientComponent
  },
  {
    path: 'client-attachment',
    component: ClientAttachmentComponent
  },
];

@NgModule({
  declarations: [
    AppComponent,
    AddClientComponent,
    ClientAttachmentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    RouterModule.forChild(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
