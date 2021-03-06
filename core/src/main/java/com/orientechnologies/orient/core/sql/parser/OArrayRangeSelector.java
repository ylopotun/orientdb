/* Generated By:JJTree: Do not edit this line. OArrayRangeSelector.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.Map;

public class OArrayRangeSelector extends SimpleNode {
  protected Integer              from;
  protected Integer              to;
  boolean                        newRange = false;

  protected OArrayNumberSelector fromSelector;
  protected OArrayNumberSelector toSelector;

  public OArrayRangeSelector(int id) {
    super(id);
  }

  public OArrayRangeSelector(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public void toString(Map<Object, Object> params, StringBuilder builder) {
    if (from != null) {
      builder.append(from);
    } else {
      fromSelector.toString(params, builder);
    }
    if (newRange) {
      builder.append("-");
      // TODO in 3.0 result.append("..");
    } else {
      builder.append("-");
    }
    if (to != null) {
      builder.append(to);
    } else {
      toSelector.toString(params, builder);
    }
  }

}
/* JavaCC - OriginalChecksum=594a372e31fcbcd3ed962c2260e76468 (do not edit this line) */
