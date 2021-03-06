/*
 * MIT License
 *
 * Copyright (c) 2020 Danterus
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.sorus.client.version.game;

import java.util.List;

public interface IGame {

  boolean isIngame();

  boolean shouldRenderHUDS();

  void display(GUIType type);

  void removeBlankGUI();

  String getCurrentServerIP();

  /**
   * Gets the game's current fps.
   *
   * @return the current fps
   */
  int getFPS();

  /**
   * Gets the player as an instance of the IEntity interface.
   *
   * @return the player
   */
  IPlayer getPlayer();

  PerspectiveMode getPerspective();

  void setPerspective(PerspectiveMode perspective);

  void sendChatMessage(String message);

  int getPing();

  IItemManager getItemManager();

  void shutdown();

  IScoreboard getScoreboard();

}
