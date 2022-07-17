import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClientAttachmentComponent } from './client-attachment.component';

describe('ClientAttachmentComponent', () => {
  let component: ClientAttachmentComponent;
  let fixture: ComponentFixture<ClientAttachmentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClientAttachmentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ClientAttachmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
