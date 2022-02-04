package comparator.com;

public class Student implements Comparable <Student>{
	
@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", qual=" + qual + ", marks=" + marks + "]";
	}
private Integer id;
private String name;
private String qual;
private Integer marks;
@Override
public int compareTo(Student o) {
	return 0;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getQual() {
	return qual;
}
public void setQual(String qual) {
	this.qual = qual;
}
public Integer getMarks() {
	return marks;
}
public void setMarks(Integer marks) {
	this.marks = marks;
}
public Student(Integer id, String name, String qual, Integer marks) {
	super();
	this.id = id;
	this.name = name;
	this.qual = qual;
	this.marks = marks;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((marks == null) ? 0 : marks.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((qual == null) ? 0 : qual.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (marks == null) {
		if (other.marks != null)
			return false;
	} else if (!marks.equals(other.marks))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (qual == null) {
		if (other.qual != null)
			return false;
	} else if (!qual.equals(other.qual))
		return false;
	return true;
}


}
