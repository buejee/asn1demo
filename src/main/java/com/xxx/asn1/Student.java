package com.xxx.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.x509.Time;

public class Student extends ASN1Object {
	
	private ASN1Integer id;
	private DERUTF8String name;
	private ASN1Integer age;
	private Time createDate;
	
	public void setId(ASN1Integer id) {
		this.id = id;
	}
	public void setName(DERUTF8String name) {
		this.name = name;
	}
	public void setAge(ASN1Integer age) {
		this.age = age;
	}
	public void setCreateDate(Time createDate) {
		this.createDate = createDate;
	}
	
	public ASN1Integer getId() {
		return id;
	}
	public DERUTF8String getName() {
		return name;
	}
	public ASN1Integer getAge() {
		return age;
	}
	public Time getCreateDate() {
		return createDate;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(ASN1Integer id, DERUTF8String name, ASN1Integer age,
			Time createDate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.createDate = createDate;
	}
	
	@Override
	public ASN1Primitive toASN1Primitive() {
		ASN1EncodableVector vector = new ASN1EncodableVector();
		vector.add(id);
		vector.add(name);
		vector.add(age);
		vector.add(createDate);
		return new DERSequence(vector);
	}

}
