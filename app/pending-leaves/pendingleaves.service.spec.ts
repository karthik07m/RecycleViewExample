import { TestBed, inject } from '@angular/core/testing';

import { PendingleavesService } from './pendingleaves.service';

describe('PendingleavesService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [PendingleavesService]
    });
  });

  it('should be created', inject([PendingleavesService], (service: PendingleavesService) => {
    expect(service).toBeTruthy();
  }));
});
