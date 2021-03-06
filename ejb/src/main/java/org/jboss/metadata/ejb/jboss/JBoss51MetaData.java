/*
* JBoss, Home of Professional Open Source
* Copyright 2006, JBoss Inc., and individual contributors as indicated
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
* This is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as
* published by the Free Software Foundation; either version 2.1 of
* the License, or (at your option) any later version.
*
* This software is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this software; if not, write to the Free
* Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
* 02110-1301 USA, or see the FSF site: http://www.fsf.org.
*/
package org.jboss.metadata.ejb.jboss;

/**
 * 5.0 jboss.xml metadata
 * 
 * @author <a href="adrian@jboss.com">Adrian Brock</a>
 * @version $Revision: 1.1 $
 */
public class JBoss51MetaData extends JBossMetaData
{
   /** The serialVersionUID */
   private static final long serialVersionUID = 1;

   /**
    * Create a new JBoss50MetaData.
    */
   public JBoss51MetaData()
   {
      // For serialization
   }

   public void setVersion(String v)
   {
      super.setVersion(v);
   }
   
   @Override
   public JBossEnterpriseBeansMetaData getEnterpriseBeans()
   {
      return super.getEnterpriseBeans();
   }
   
   @Override
   public void setEnterpriseBeans(JBossEnterpriseBeansMetaData beans)
   {
      super.setEnterpriseBeans(beans);
   }
}
