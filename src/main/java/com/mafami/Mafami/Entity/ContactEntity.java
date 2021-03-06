package com.mafami.Mafami.Entity;

import java.util.Calendar;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* @author root {1:51:17 PM}:
 * @version Creation time: Nov 8, 2020 1:51:17 PM
 * Class Description
*/
/**
 * @author tankyhuynh
 *
 */

@Document(collection = "contact")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactEntity {

	@Id
	private String id;
	private String email;
	private String customerName;
	private String content;
	private Date time = Calendar.getInstance().getTime();
	private boolean isChecked;
	private String site;

}
