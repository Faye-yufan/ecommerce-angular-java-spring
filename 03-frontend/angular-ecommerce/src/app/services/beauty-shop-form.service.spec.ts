import { TestBed } from '@angular/core/testing';

import { BeautyShopFormService } from './beauty-shop-form.service';

describe('BeautyShopFormService', () => {
  let service: BeautyShopFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BeautyShopFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
