/*
 * Copyright (C) 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.nacos.naming.push;

import com.alibaba.nacos.naming.core.Service;

/**
 * @author pbting
 * @date 2019-08-28 8:52 AM
 */
public interface IEmitter {

    /**
     * get an emit source
     *
     * @param sourceKey the key of source
     * @return
     */
    <T> T getEmitSource(String sourceKey);

    /**
     * initializer emitter
     */
    void initEmitter();

    /**
     * emitter service when service instance is changed
     *
     * @param service
     */
    void emitter(Service service);

    /**
     * get push client factory.will use it to construct a push client.
     *
     * @return
     */
    IPushClientFactory getPushClientFactory();
}
