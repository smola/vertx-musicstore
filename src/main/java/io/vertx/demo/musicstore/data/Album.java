/*
 * Copyright 2020 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.demo.musicstore.data;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.codegen.format.SnakeCase;
import io.vertx.core.json.JsonObject;
import io.vertx.sqlclient.templates.annotations.Column;
import io.vertx.sqlclient.templates.annotations.RowMapped;

@DataObject(generateConverter = true)
@RowMapped(formatter = SnakeCase.class)
public class Album {

  private Long id;
  private String title;
  @Column(name = "mb_album_id")
  private String musicBrainAlbumId;

  public Long getId() {
    return id;
  }

  public Album setId(Long id) {
    this.id = id;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public Album setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getMusicBrainAlbumId() {
    return musicBrainAlbumId;
  }

  public Album setMusicBrainAlbumId(String musicBrainAlbumId) {
    this.musicBrainAlbumId = musicBrainAlbumId;
    return this;
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    AlbumConverter.toJson(this, json);
    return json;
  }


  @Override
  public String toString() {
    return "Album{" +
      "id=" + id +
      ", title='" + title + '\'' +
      ", musicBrainAlbumId='" + musicBrainAlbumId + '\'' +
      '}';
  }
}
