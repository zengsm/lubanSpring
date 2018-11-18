package contacts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

//@Repository
public class ContactRepository {

	/*private JdbcTemplate jdbc;
	
	@Autowired
	public ContactRepository(JdbcTemplate jdbc){
		this.jdbc = jdbc;
	}
	
	public List<Contact> findAll(){
		String sql = "select id, firstName, lastName, phoneNumber, emailAddress from contacts order by lastName";
		RowMapper<Contact> rowMapper = new RowMapper<Contact>() {

			public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Contact contact = new Contact();
				contact.setId(rs.getLong(1));
				contact.setFirstName(rs.getString(2));
				contact.setLastName(rs.getString(3));
				contact.setPhoneNumber(rs.getString(4));
				contact.setEmailAddress(rs.getString(5));
				
				return contact;
			}
		};
		return jdbc.query(sql, rowMapper);
	}
	
	public void save(Contact contact){
		String sql = "insert into contacts (firstName, lastName, phoneNumber, emailAddress) values(?,?,?,?)";
		jdbc.update(sql, contact.getFirstName(),contact.getLastName(),contact.getPhoneNumber(),contact.getEmailAddress());
	}*/
	
}
