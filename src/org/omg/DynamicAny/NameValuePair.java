package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/NameValuePair.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from ../../../../src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Thursday, August 29, 2002 1:38:29 AM GMT-08:00
*/


/**
    * NameValuePairs associate a name with an Any object.
    */
public final class NameValuePair implements org.omg.CORBA.portable.IDLEntity
{

  /**
          * The name associated with the Any.
          */
  public String id = null;

  /**
          * The Any value associated with the name.
          */
  public org.omg.CORBA.Any value = null;

  public NameValuePair ()
  {
  } // ctor

  public NameValuePair (String _id, org.omg.CORBA.Any _value)
  {
    id = _id;
    value = _value;
  } // ctor

} // class NameValuePair
