import { TestBed } from '@angular/core/testing';

import { SecondaryRecordService } from './secondary-record.service';

describe('SecondaryRecordService', () => {
  let service: SecondaryRecordService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SecondaryRecordService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
