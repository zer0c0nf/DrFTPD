/*
 * This file is part of DrFTPD, Distributed FTP Daemon.
 *
 * DrFTPD is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * DrFTPD is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with DrFTPD; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.drftpd.slave.async;


/**
 * @author zubov
 * @version $Id: AsyncResponseMaxPath.java,v 1.4 2004/11/08 18:39:31 mog Exp $
 */
public class AsyncResponseMaxPath extends AsyncResponse {
    int _maxPath;

    public AsyncResponseMaxPath(String index, int maxPath) {
        super(index);
        _maxPath = maxPath;
    }

    public int getMaxPath() {
        return _maxPath;
    }

    public String toString() {
        return getClass().getName() + "[maxPath=" + getMaxPath() + "]";
    }
}
