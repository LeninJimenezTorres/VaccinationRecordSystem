import { TestBed } from '@angular/core/testing';

import { MainRecordService } from './main-record.service';

describe('MainRecordService', () => {
  let service: MainRecordService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MainRecordService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
