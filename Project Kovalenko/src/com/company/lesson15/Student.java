package com.company.lesson15;

import java.util.Arrays;

public class Student {
	private String name;
	private String group;
	private int course;
	private int[] rating;

	public Student(String name, String group, int course, int[] rating) {
		this.name = name;
		this.group = group;
		this.course = course;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public void setRating(int[] rating) {
		this.rating = rating;
	}

	public float averageRating() {
		if (rating.length == 0) {
			return 0;
		}
		float averageRating = 0;
		for (int r : rating) {
			averageRating += r;
		}
		return averageRating / rating.length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(rating);
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
		if (course != other.course)
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(rating, other.rating))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", group=" + group + ", course=" + course + ", averageRating()="
				+ averageRating() + "]";
	}
}
