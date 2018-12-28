import { TestBed, inject } from '@angular/core/testing';

import { ApplyleaveService } from './applyleave.service';

describe('ApplyleaveService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ApplyleaveService]
    });
  });

  it('should be created', inject([ApplyleaveService], (service: ApplyleaveService) => {
    expect(service).toBeTruthy();
  }));
});
