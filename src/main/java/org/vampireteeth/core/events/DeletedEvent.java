package org.vampireteeth.core.events;

public class DeletedEvent{
  protected boolean entityFound = true;

  public boolean isEntityFound() {
    return this.entityFound;
  }
}
