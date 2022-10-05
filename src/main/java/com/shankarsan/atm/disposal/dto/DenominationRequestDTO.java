/**
 * 
 */
package com.shankarsan.atm.disposal.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author SHANKARSAN
 *
 */
public class DenominationRequestDTO extends BaseRequestDTO{

	@JsonProperty("rfe") @NotBlank private String denominationName;
	@JsonProperty("djq") @NotBlank private String denominationCurrencyCode;
	@JsonProperty("bsi") @Positive private Long denominationValue;
	@JsonProperty("elj") @NotBlank private String denominationType;
	@JsonProperty("dce") private Date effectiveDate;
//	@JsonProperty("cvf") @NotBlank private String denominationLegislationCode;
//	
//	public String getDenominationLegislationCode() {
//		return denominationLegislationCode;
//	}
//	public void setDenominationLegislationCode(String denominationLegislationCode) {
//		this.denominationLegislationCode = denominationLegislationCode;
//	}
	public String getDenominationType() {
		return denominationType;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public void setDenominationType(String denominationType) {
		this.denominationType = denominationType;
	}
	/**
	 * @return the denominationName
	 */
	public String getDenominationName() {
		return denominationName;
	}
	/**
	 * @param denominationName the denominationName to set
	 */
	public void setDenominationName(String denominationName) {
		this.denominationName = denominationName;
	}
	/**
	 * @return the denominationCurrencyCode
	 */
	public String getDenominationCurrencyCode() {
		return denominationCurrencyCode;
	}
	/**
	 * @param denominationCurrencyCode the denominationCurrencyCode to set
	 */
	public void setDenominationCurrencyCode(String denominationCurrencyCode) {
		this.denominationCurrencyCode = denominationCurrencyCode;
	}
	/**
	 * @return the denominationValue
	 */
	public Long getDenominationValue() {
		return denominationValue;
	}
	/**
	 * @param denominationValue the denominationValue to set
	 */
	public void setDenominationValue(Long denominationValue) {
		this.denominationValue = denominationValue;
	}
	
}
