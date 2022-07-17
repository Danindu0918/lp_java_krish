import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Route, RouterModule } from '@angular/router';

// Add Client
import { AddClientComponent } from './add-client/add-client.component';

// Client-Attachment
import { ClientAttachmentComponent } from './client-attachment/client-attachment.component';


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
    AddClientComponent,
    ClientAttachmentComponent
  ],
  imports: [
    RouterModule.forChild(routes),
    CommonModule,
  ]
})
export class ClientModuleModule { }
