package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Teknology;

public interface TeknologyService {
	
	Result add(Teknology teknology);
	DataResult<List<Teknology>> getAllByJobSeekerId(int id);
}
