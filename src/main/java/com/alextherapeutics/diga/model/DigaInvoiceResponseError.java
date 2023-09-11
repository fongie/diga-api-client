/*
 * Copyright 2021-2021 Alex Therapeutics AB and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package com.alextherapeutics.diga.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/** An error received from sending a DiGA XML invoice. */
@Builder
@Getter
@ToString
public class DigaInvoiceResponseError implements DigaApiResponseError {
  /** The ID of the validation step that errored. May be null if no scenario was matched. */
  private final String validationStepId;

  /** The messages received for the error in the report */
  private final String messages;

  /**
   * The "Resource" that was not valid. This will give information on which schema/schematron/xsl
   * was used for validating this error.
   */
  private final String resources;
}
