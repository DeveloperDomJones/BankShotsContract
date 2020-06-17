package com.bankshotscontract.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.bankshotscontract.model.Stock;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "stockPortfolio")
public class StockPortfolio {
	
	@Id
	private String id;
	private String accountId;
	private List<Stock> stocks;

	

}
