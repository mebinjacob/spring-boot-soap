package com.hcentive.webservice.soap;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.hcentive.Form;

/**
 * @author Mebin.Jacob
 * Repository class to save data. 
 */
@Component
public class FormRepository {
	private static final List<Form> forms = new ArrayList<Form>();

	@PostConstruct
	public void initData() {
		Form form = new Form();
		Form.ExistingMember member = new Form.ExistingMember();
		Form.ExistingMember.ExistingMemberId existingMemberId = new Form.ExistingMember.ExistingMemberId();
		existingMemberId.setValue("1");
		member.setExistingMemberId(existingMemberId);
		form.setExistingMember(member);
		
		forms.add(form);
	}

	public Form findForm(String val) {
		Assert.notNull(val);

		Form result = null;

		for (Form f : forms) {
			if (val.equals(f.getExistingMember().getExistingMemberId().getValue())) {
				result = f;
			}
		}

		return result;
	}
}
