package org.omg.IOP;

/**
* org/omg/IOP/TaggedProfileHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from ../../../../src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, August 29, 2002 1:38:21 AM GMT-08:00
*/


/** 
     * Object references have at least one tagged profile. Each profile 
     * supports one or more protocols and encapsulates all the basic 
     * information the protocols it supports need to identify an object. 
     * Any single profile holds enough information to drive a complete 
     * invocation using any of the protocols it supports; the content 
     * and structure of those profile entries are wholly specified by 
     * these protocols.
     */
public final class TaggedProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.TaggedProfile value = null;

  public TaggedProfileHolder ()
  {
  }

  public TaggedProfileHolder (org.omg.IOP.TaggedProfile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.TaggedProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.TaggedProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.TaggedProfileHelper.type ();
  }

}
