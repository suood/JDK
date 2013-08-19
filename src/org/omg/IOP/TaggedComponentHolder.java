package org.omg.IOP;

/**
* org/omg/IOP/TaggedComponentHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from ../../../../src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, August 29, 2002 1:38:21 AM GMT-08:00
*/


/**
     * <code>TaggedComponents</code> contained in 
     * <code>TAG_INTERNET_IOP</code> and 
     * <code>TAG_MULTIPLE_COMPONENTS</code> profiles are identified by 
     * unique numeric tags using a namespace distinct form that is used for 
     * profile tags. Component tags are assigned by the OMG.
     * <p>
     * Specifications of components must include the following information:
     * <ul>
     *   <li><i>Component ID</i>: The compound tag that is obtained 
     *       from OMG.</li>
     *   <li><i>Structure and encoding</i>: The syntax of the component 
     *       data and the encoding rules.  If the component value is 
     *       encoded as a CDR encapsulation, the IDL type that is
     *       encapsulated and the GIOP version which is used for encoding 
     *       the value, if different than GIOP 1.0, must be specified as 
     *       part of the component definition.</li>
     *   <li><i>Semantics</i>: How the component data is intended to be 
     *       used.</li>
     *   <li><i>Protocols</i>: The protocol for which the component is 
     *       defined, and whether it is intended that the component be 
     *       usable by other protocols.</li>
     *   <li><i>At most once</i>: whether more than one instance of this 
     *       component can be included in a profile.</li>
     * </ul>
     * Specification of protocols must describe how the components affect 
     * the protocol. The following should be specified in any protocol 
     * definition for each <code>TaggedComponent</code> that the protocol uses:
     * <ul>
     *   <li><i>Mandatory presence</i>: Whether inclusion of the component 
     *       in profiles supporting the protocol is required (MANDATORY 
     *       PRESENCE) or not required (OPTIONAL PRESENCE).</li>
     *   <li><i>Droppable</i>: For optional presence component, whether 
     *       component, if present, must be retained or may be dropped.</li>
     * </ul>
     */
public final class TaggedComponentHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.TaggedComponent value = null;

  public TaggedComponentHolder ()
  {
  }

  public TaggedComponentHolder (org.omg.IOP.TaggedComponent initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.TaggedComponentHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.TaggedComponentHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.TaggedComponentHelper.type ();
  }

}
